package eu.javaca.playground.challengenentry.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassUtil {
    private static final Logger LOG = LoggerFactory.getLogger(ClassUtil.class);

    /**
     * See <a href="https://www.artima.com/weblogs/viewpost.jsp?thread=208860">https://www.artima.com/weblogs/viewpost.jsp?thread=208860</a><br>
     * <p>
     * Get the underlying class for a type, or null if the type is a variable type.
     *
     * @param type the type
     * @return the underlying class
     */
    public static Class<?> getUnderlyingClass(Type type) {
        if (type instanceof Class) {
            return (Class<?>) type;
        } else if (type instanceof ParameterizedType) {
            return getUnderlyingClass(((ParameterizedType) type).getRawType());
        } else if (type instanceof GenericArrayType) {
            Type componentType = ((GenericArrayType) type).getGenericComponentType();
            Class<?> componentClass = getUnderlyingClass(componentType);
            if (componentClass != null) {
                return Array.newInstance(componentClass, 0).getClass();
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    /**
     * Checks if a class can be instantiated:
     * <ul>
     *     <li>is not abstract</li>
     *     <li>is not interface</li>
     *     <li>has a public constructor with no arguments</li>
     * </ul>
     *
     * @param clz to check
     * @return true if class can be instantiated, false if not
     */
    public static boolean canInstantiateClass(Class<?> clz) {
        boolean abstractOrInterface = Modifier.isAbstract(clz.getModifiers()) || Modifier.isInterface(clz.getModifiers());

        if (abstractOrInterface) {
            LOG.error("Class {} is abstract or an interface!", clz.getName());
            return false;
        }

        try {
            clz.getDeclaredConstructor().newInstance();
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException |
                 NoSuchMethodException ex) {
            LOG.error("Class {} has no default constructor!", clz.getName());
            return false;
        }

        return true;
    }

    /**
     * Instantiates an object using its no arguments constructor.
     *
     * @param clz that gets its constructor called
     * @return class instance or null if class cannot be instantiated
     */
    public static Object callDeclaredConstructor(Class<?> clz) {
        Object instance = null;
        try {
            instance = clz.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            LOG.error("Class {} has no default constructor!", clz);
//            throw new IllegalArgumentException("Class has no default constructor!");
        }
        return instance;
    }

    /**
     * Returns a list of all the fields in a class, including fields from superclasses.
     *
     * @param cls candidate
     * @return list of all fields
     */
    public static List<Field> getTypeFields(Class<?> cls) {
        List<Field> fields = new ArrayList<>(Arrays.asList(cls.getDeclaredFields()));

        Class<?> c = cls.getSuperclass();
        while (c != null) {
            fields.addAll(Arrays.asList(c.getDeclaredFields()));
            c = c.getSuperclass();
        }
        return fields;
    }

}

package jsonproject;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * json转Obj
 * 
 * @author Administrator
 *
 */
public class JsonToObject {

	public static <T> T getObjectFromJson(Class<T> clazz, String jsonStr) {

		T newInstance = null;
		
		
		
//		try {
//			newInstance = clazz.newInstance();
//
//		} catch (InstantiationException | IllegalAccessException e) {
//			e.printStackTrace();
//		}
//
//		if (List.class.getName().equals(clazz.getName())) {
//			Type genericSuperclass = clazz.getGenericSuperclass();
//			Class<?> genericeType = null;
//			if (genericSuperclass instanceof ParameterizedType) {
//				Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
//				if (actualTypeArguments != null && actualTypeArguments.length != 0) {
//					genericeType = (Class<?>) actualTypeArguments[0];
//				}
//			}
//			List<Object> newInstanceList = (List<Object>) newInstance;
//
//			try {
//				JSONArray jsonArray = new JSONArray(jsonStr);
//				for (int i = 0; i < jsonArray.length(); i++) {
//					JSONObject object = jsonArray.getJSONObject(i);
//					String subJsonStr = object.toString();
//					System.out.println("subJsonStr " + subJsonStr);
//					((List) newInstance).add(getObjectFromJson(genericeType, subJsonStr));
//				}
//			} catch (JSONException e) {
//				e.printStackTrace();
//			}
//		} else {
//			JSONObject jsonObject = null;
//			try {
//				jsonObject = new JSONObject(jsonStr);
//			} catch (JSONException e) {
//				e.printStackTrace();
//			}
//			if (Integer.TYPE.getName().equals(clazz.getName())) {
//				newInstance = (T) Integer.valueOf(jsonStr);
//			} else if (Long.TYPE.getName().equals(clazz.getName())) {
//				newInstance = (T) Long.valueOf(jsonStr);
//			} else if (Double.TYPE.getName().equals(clazz.getName())) {
//				newInstance = (T) Double.valueOf(jsonStr);
//			} else if (Integer.class.getName().equals(clazz.getName())) {
//				newInstance = (T) Integer.valueOf(jsonStr);
//			} else if (Long.class.getName().equals(clazz.getName())) {
//				newInstance = (T) Long.valueOf(jsonStr);
//			} else if (Double.class.getName().equals(clazz.getName())) {
//				newInstance = (T) Double.valueOf(jsonStr);
//			} else if (String.class.getName().equals(clazz.getName())) {
//				newInstance = (T) jsonStr;
//			} else if (Boolean.class.getName().equals(clazz.getName())) {
//				newInstance = (T) Boolean.valueOf(jsonStr);
//			} else if (Boolean.TYPE.getName().equals(clazz.getName())) {
//				newInstance = (T) Boolean.valueOf(jsonStr);
//			} else {// 非基本类型和内置类型以外的对象
//
//				List<Field> parseFields = MainClass.getParseFields(clazz);
//
//				for (Field field : parseFields) {
//					// 设置属性
//					String fieldName = field.getName();
//					try {
//						field.set(newInstance, getObjectFromJson(field.getType(), jsonObject.get(fieldName).toString()));
//					} catch (IllegalArgumentException | IllegalAccessException | JSONException e) {
//						e.printStackTrace();
//					}
//				}
//
//			}
//		}
		return (T) newInstance;
	}

	public static Object getGenericType() {

		return null;
	}

}

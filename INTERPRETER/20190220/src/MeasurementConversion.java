import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MeasurementConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 pint to tablespoons
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String questionAsked = JOptionPane.showInputDialog(frame, "What is your question");

		ConversionContext question = new ConversionContext(questionAsked);
		String fromConversion = question.getFromConversion();

		String toConversion = question.getToConversion();

		double quantity = question.getQuantity();
		try {

			Class tempClass = Class.forName(fromConversion);
			Constructor con = tempClass.getConstructor();
			Object convertFrom = (Expression) con.newInstance();

			Class[] methodParams = new Class[] { Double.TYPE };

			@SuppressWarnings("unchecked")
			Method conversionMethod = tempClass.getMethod(toConversion, methodParams);

			Object[] params = new Object[] { new Double(quantity) };

			String toQuantity = (String) conversionMethod.invoke(convertFrom, params);

			String answerToQues = question.getResponse() + toQuantity + " " + toConversion;

			JOptionPane.showMessageDialog(null, answerToQues);
			frame.dispose();

		} catch (ClassNotFoundException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} catch (NoSuchMethodException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} catch (SecurityException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} catch (InstantiationException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} catch (IllegalAccessException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} catch (IllegalArgumentException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} catch (InvocationTargetException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
	}

}

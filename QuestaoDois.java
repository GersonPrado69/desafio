package br.com.capgemini;

public class QuestaoDois {

	public void senha(String senha) {

		boolean isLength = false, isLowerCase = false, isUpperCAse = false, isDigit = false, isCaracterEspecial = false;
		String caracterEspecial = "!@#$%^&*()-+";

		if (senha.length() >= 6) {
			isLength = true;
		}

		for (char i : senha.toCharArray()) {
			if (Character.isLowerCase(i)) {
				isLowerCase = true;
			}

			if (Character.isUpperCase(i)) {
				isUpperCAse = true;
			}

			if (Character.isDigit(i)) {
				isDigit = true;
			}

			if (caracterEspecial.contains(Character.toString(i))) {
				isCaracterEspecial = true;
			}
		}

		if (isLength && isLowerCase && isUpperCAse && isDigit && isCaracterEspecial) {
			System.out.println("Senha válida!");
		} else {
			System.out.println("Senha inválida!");
		}
	}

}
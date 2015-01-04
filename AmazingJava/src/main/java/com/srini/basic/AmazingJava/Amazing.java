package com.srini.basic.AmazingJava;

public class Amazing {
	public static void main(String args[]) {
		for (int i = 0; i == 0; i++) {
			class Really {
				class Quite {
					class Surprising {
						public String toString() {
							return ("it really works !");
						}
					}
				}
			}
			System.out.println("It may be hard to believe, but "
					+ ((new Really()).new Quite()).new Surprising());
		}
	}
}

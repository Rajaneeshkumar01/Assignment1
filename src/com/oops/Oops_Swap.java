package com.oops;

public class Oops_Swap {
	static class Pallindrome {

		static int countSwap(String str) {

			int n = str.length();

			char s[] = str.toCharArray();

			int count = 0;

			for (int i = 0; i < n / 2; i++) {

				int left = i;

				int right = n - left - 1;

				while (left < right) {

					if (s[left] == s[right]) {
						break;
					} else {
						right--;
					}
				}

				if (left == right) {
					return -1;
				} else if (s[left] != s[n - left - 1]) {
					char temp = s[right];
					s[right] = s[n - left - 1];
					s[n - left - 1] = temp;
					count++;
				}
			}

			return count;
		}

		public static void main(String[] args) {
			String s = "welcome to delliote";

			int ans1 = countSwap(s);
			System.out.println(ans1);
		}
	}


}

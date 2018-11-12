
#include <stdio.h>
#include <string.h>

char	*ft_memset(char *str, int c, unsigned int len);

int main(void)
{
	char str[13];
	char str2[13];
	char my_str[13];
	char my_str2[13];

	strcpy(str, "Hello World!");
	strcpy(str2, "Hello World!");
	strcpy(my_str, "Hello World!");
	strcpy(my_str2, "Hello World!");


	printf("%s\n", str);
	printf("%s\n", str2);


	memset(str, 'a', 5);
	ft_memset(my_str, 'a', 5);

	memset(str2, 'a', 12);
	ft_memset(my_str2, 'a', 12);


	printf("%s\n", str);
	printf("%s\n", my_str);

	printf("%s\n", str2);
	printf("%s\n", my_str2);

	return (0);
}
/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_memchr_test.c                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: dleurs <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2018/11/12 16:56:28 by dleurs            #+#    #+#             */
/*   Updated: 2018/11/12 16:56:30 by dleurs           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <stdio.h>
#include <string.h>

void	*ft_memchr(const void *s, int c, size_t n);

int main (void)
{
	char str1[20];
	strcpy(str1, "Hello World!");
	printf("%s\n", memchr(str1, 'W', 20));
	printf("%s\n", ft_memchr(str1, 'W', 20));
	return (0);
}
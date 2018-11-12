/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_bzero_test.c                                    :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: dleurs <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2018/11/12 13:55:16 by dleurs            #+#    #+#             */
/*   Updated: 2018/11/12 13:55:17 by dleurs           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <stdio.h>
#include <string.h>

void				ft_bzero(void *s, size_t n);

int main(void)
{
	char str[20];
	strcpy(str, "Hello World !");
	printf("%s\n", str);
	bzero(str, 6);
	printf("%s\n", str);
	return (0);
}

/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_memcmp.c                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: dleurs <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2018/11/12 17:48:46 by dleurs            #+#    #+#             */
/*   Updated: 2018/11/12 17:48:47 by dleurs           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include "libft.h"
#include <string.h>

int		ft_memcmp(const void *s1, const void *s2, size_t n)
{
	unsigned int 	i;
	unsigned char 	*s1_char;
	unsigned char	*s2_char;

	i = 0;
	s1_char = (unsigned char *)(s1);
	s2_char = (unsigned char *)(s2);
	if (n == 0)
		return (0);
	while (s1_char[i] == s2_char[i] && i < (unsigned int)n - 1)
	{
		i++;
		if (i == (unsigned int)n)
			return (0);
	}
	return (s1_char[i] - s2_char[i]);
}

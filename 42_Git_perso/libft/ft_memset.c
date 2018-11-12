/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_memset.c                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: dleurs <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2018/11/12 12:20:25 by dleurs            #+#    #+#             */
/*   Updated: 2018/11/12 12:20:26 by dleurs           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include "libft.h"

void			*ft_memset(void *str, int c, size_t len)
{
	unsigned char	*my_str;
	unsigned int	i;

	my_str = (unsigned char *)str;
	i = 0;
	while (i < len)
	{
		my_str[i] = (unsigned char)c;
		i++;
	}
	return (str);
}

/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strneq.c                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: dleurs <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2018/12/01 20:02:53 by dleurs            #+#    #+#             */
/*   Updated: 2018/12/01 20:02:54 by dleurs           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include "libft.h"
#include <stdlib.h>

int		ft_strnequ(char const *s1, char const *s2, size_t n)
{
	unsigned int i;

	i = 0;
	while (s1[i] == s2[i] && i < (unsigned int)n)
	{
		i++;
		if (s1[i] == '\0' && s2[i] == '\0')
			return (1);
	}
	return (0);
}

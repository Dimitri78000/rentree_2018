/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_atoi.c                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: dleurs <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2018/11/06 18:51:35 by dleurs            #+#    #+#             */
/*   Updated: 2018/11/06 18:51:43 by dleurs           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include "libft.h"

int		ft_atoi(const char *str)
{
	size_t	nbr;
	int		i;
	int		sign;

	i = 0;
	nbr = 0;
	sign = 1;
	while (str[i] == '\t' || str[i] == '\r' || str[i] == '+' ||
	str[i] == '\v' || str[i] == '\f' || str[i] == ' ' || str[i] == '\n')
		i++;
	if (str[i] == '-')
	{
		sign = sign * (-1);
		i++;
	}
	while (str[i] >= '0' && str[i] <= '9')
	{
		nbr = nbr * 10 + str[i] - 48;
		if (sign == 1 && nbr > INT64_MAX)
			return (-1);
		if (sign == -1 && nbr > (size_t)(INT64_MAX) + 1)
			return (0);
		i++;
	}
	return (sign * nbr);
}

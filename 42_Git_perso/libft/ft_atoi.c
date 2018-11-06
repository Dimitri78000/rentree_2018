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

int	ft_strcmp(char *s1, char *s2);

int ft_atoi(char *str)
{
	int nbr;
	int i;
	int sign;

	i = 0;
	nbr = 0;
	sign = 1;
	if (ft_strcmp(str, "-2147483648") == 0)
		return (-2147483648);
	while (str[i] == '-')  
	{
		sign = sign * (-1);
		i++;
	}
	while (str[i] >= '0' && str[i] <= '9')  
	{
		nbr = nbr * 10 + str[i] - 48;
		i++;
	}
	return (sign * nbr);
}

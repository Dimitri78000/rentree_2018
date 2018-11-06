/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strstr.c                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: dleurs <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2018/11/06 20:22:09 by dleurs            #+#    #+#             */
/*   Updated: 2018/11/06 20:22:11 by dleurs           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

int		ft_strlen(char *str);

char	*ft_strstr(char *str, char *to_find)
{
	int i_str;
	int i_word;
	int len_word;

	len_word = ft_strlen(to_find);
	i_str = 0;
	while (str[i_str + len_word - 1] != '\0')
	{
		i_word = 0;
		while (str[i_str + i_word] == to_find[i_word])
		{
			i_word += 1;
			if (i_word == len_word)
				return (&str[i_str]);
		}
		i_str++;
	}
	return ("(null)");
}

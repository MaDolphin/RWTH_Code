import util
import os

def mainFun(data,result):


    t = data[0.07].get("DN15").get("R")

    result[2][4] = t

    return result


if __name__ == '__main__':
	filename_data = "data.xls"
	filePath_data = os.path.join(os.getcwd(), filename_data)
	filename_result = "result.xls"
	filePath_result = os.path.join(os.getcwd(), filename_result)
	data = util.read_data(filePath_data)
	result,rows_old = util.init_result(filePath_result)

# 邻近取值
#####################################################################
	t = 0.674

	if t in data:
		r = data[t].get("DN15").get("R")
	else:
		add = t
		min = t
		while(not round(add,2) in data != True):
			add = add + 0.01
		while(not round(min,2) in data != True):
			min = min - 0.01
		abs_add = abs(add-t)
		abs_min = abs(min-t)
		if abs_add <= abs_min:
			r = data[round(add,2)].get("DN15").get("R")
		else:
			r = data[round(min,2)].get("DN15").get("R")
	print(r)
#####################################################################

	# result = mainFun(data,result)
	# util.write_excel_xls_append(filePath_result,result)

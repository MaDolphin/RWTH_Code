#coding:utf-8

import xlwt
import xlrd
from xlutils.copy import copy
import os

#设置表格样式
def set_style(choose):
	# style0 = xlwt.easyxf('font: name Times New Roman, color-index red, bold on',
	# 					 num_format_str='#,##0.00')
	# style1 = xlwt.easyxf(num_format_str='D-MMM-YY')
	if choose == 1:
		return xlwt.easyxf('font: name Times New Roman, color-index red, bold on')
	else:
		return xlwt.easyxf('font: name Times New Roman, color-index black, bold on')


# 结果文件追加
def write_excel_xls_append(path, value):
	index = len(value)  # 获取需要写入数据的行数
	workbook = xlrd.open_workbook(path)  # 打开工作簿
	# workbook = openpyxl.Workbook()
	sheets = workbook.sheet_names()  # 获取工作簿中的所有表格
	worksheet = workbook.sheet_by_name(sheets[0])  # 获取工作簿中所有表格中的的第一个表格
	# rows_old = worksheet.nrows  # 获取表格中已存在的数据的行数
	new_workbook = copy(workbook)  # 将xlrd对象拷贝转化为xlwt对象
	new_worksheet = new_workbook.get_sheet(0)  # 获取转化后工作簿中的第一个表格
	for i in range(0, index):
		for j in range(0, len(value[i])):
			t = str(value[i][j])
			if t[0] == "@":
				value[i][j] = float(value[i][j][1:])
				new_worksheet.write(i+2, j, value[i][j],set_style(1))  # 追加写入数据
			else:
				new_worksheet.write(i + 2, j, value[i][j], set_style(0))  # 追加写入数据
	new_workbook.save(path)  # 保存工作簿

# 读取参数
def read_data(filePath):
	wb = xlrd.open_workbook(filePath)#打开文件
	sheet = wb.sheet_by_index(0)
	# sheet = wb.sheet_by_name('Trinkwasser')#通过名字获取表格
	# 获取当前页的行数
	row = sheet.nrows
	dic_all = {}

	for i in range(4,row):
		dic = {}
		dic15 = {}
		dic20 = {}
		dic25 = {}

		list = sheet.row_values(i)

		dic15["R"] = list[1]
		dic15["V"] = list[2]
		dic20["R"] = list[3]
		dic20["V"] = list[4]
		dic25["R"] = list[5]
		dic25["V"] = list[6]

		dic["VS"] = list[0]
		dic["DN15"] = dic15
		dic["DN20"] = dic20
		dic["DN25"] = dic25

		dic_all[list[0]] = dic

	return dic_all

# 初始化数组
def init_result(path):
	nums = []
	workbook = xlrd.open_workbook(path)  # 打开工作簿
	sheets = workbook.sheet_names()  # 获取工作簿中的所有表格
	worksheet = workbook.sheet_by_name(sheets[0])  # 获取工作簿中所有表格中的的第一个表格
	rows_old = worksheet.nrows - 2  # 获取表格中已存在的数据的行数
	for i in range(2, worksheet.nrows):
		nums.append([])
		for j in range(0, worksheet.ncols):
			if worksheet.cell_value(i, j) == "":
				nums[i-2].append("#")
			else:
				nums[i-2].append(worksheet.cell_value(i, j))
	# print(nums)
	# print(rows_old)
	return nums,rows_old

if __name__ == '__main__':
	filename_data = "data.xls"
	filePath_data = os.path.join(os.getcwd(), filename_data)
	filename_result = "result.xls"
	filePath_result = os.path.join(os.getcwd(), filename_result)
	data = read_data(filePath_data)
	result,rows_old = init_result(filePath_result)

# 邻近取值
#####################################################################
	t = 0.674

	if t in data:
		r = data[t].get("DN15").get("R")
	else:
		add = t
		min = t
		while (not round(add, 2) in data != True):
			add = add + 0.01
		while (not round(min, 2) in data != True):
			min = min - 0.01
		abs_add = abs(add - t)
		abs_min = abs(min - t)
		if abs_add <= abs_min:
			r = data[round(add, 2)].get("DN15").get("R")
		else:
			r = data[round(min, 2)].get("DN15").get("R")
	print(r)
#####################################################################

	# result[1][9] = '@'+str(45.97)
	# write_excel_xls_append(filePath_result,result)
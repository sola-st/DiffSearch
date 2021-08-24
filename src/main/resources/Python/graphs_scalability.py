# libraries
import matplotlib.pyplot as plt
import matplotlib.style as style
import numpy as np
import pandas as pd
from matplotlib.ticker import MaxNLocator

def plot_method(path):
		style.use('seaborn-paper') #sets the size of the charts
		style.use('seaborn-paper')

		plt.rc('xtick',labelsize=18)
		plt.rc('ytick',labelsize=18)


		#Reading csv feature vectors files
		data = pd.read_csv('./'+path+'/scalability.csv', header=None, sep= ',').iloc[:, :].values[0:, :].astype('float32')

		axes = plt.gca()
		
		#axes.xaxis.set_major_locator(MaxNLocator(integer=True))
		axes.ticklabel_format(useOffset=False, style='plain')
		plt.setp(axes.get_xticklabels(), rotation=30, horizontalalignment='right')

		x = [0, 10000, 50000, 100000, 250000, 400000, 500000, 600000, 700000, 850000, 1000000]

		query1_tot = []
		query1_tot.append(0)

		i = 0
		while i < 10:
			query1_tot.append(data[i][1]+data[i][2])
			i += 1

		query2_tot = []
		query2_tot.append(0)

		i = 0
		while i < 10:
			query2_tot.append(data[i][3]+data[i][4])
			i += 1

		query3_tot = []
		query3_tot.append(0)

		i = 0
		while i < 10:
			query3_tot.append(data[i][5]+data[i][6])
			i += 1

		query4_tot = []
		query4_tot.append(0)

		i = 0
		while i < 10:
			query4_tot.append(data[i][7]+data[i][8])
			i += 1

		query5_tot = []
		query5_tot.append(0)

		i = 0
		while i < 10:
			query5_tot.append(data[i][9]+data[i][10])
			i += 1

		query6_tot = []
		query6_tot.append(0)

		i = 0
		while i < 10:
			query6_tot.append(data[i][11]+data[i][12])
			i += 1

		query7_tot = []
		query7_tot.append(0)

		i = 0
		while i < 10:
			query7_tot.append(data[i][13]+data[i][14])
			i += 1

		query8_tot = []
		query8_tot.append(0)

		i = 0
		while i < 10:
			query8_tot.append(data[i][15]+data[i][16])
			i += 1

		query9_tot = []
		query9_tot.append(0)

		i = 0
		while i < 10:
			query9_tot.append(data[i][17]+data[i][18])
			i += 1

		query10_tot = []
		query10_tot.append(0)

		i = 0
		while i < 10:
			query10_tot.append(data[i][19]+data[i][20])
			i += 1

		#axes.set_ylim([0,max(query1_tot + query2_tot + query3_tot + query5_tot + 
		 #           query6_tot + query7_tot + query8_tot + query9_tot + query10_tot)+0.2])

		axes.set_ylim([0,30])

		# use the plot function
		plt.plot(x,query1_tot,  marker='', color='red', label='Query 1', linewidth=2)
		plt.plot(x,query2_tot,  marker='', color='olive', label='Query 2', linewidth=2)
		plt.plot(x,query3_tot,  marker='', color='blue', label='Query 3', linewidth=2)
		plt.plot(x,query4_tot,  marker='', color='orange',label='Query 4', linewidth=2)
		plt.plot(x,query5_tot,  marker='', color='black', label='Query 5',linewidth=2)
		plt.plot(x,query6_tot,  marker='', color='lightblue', label='Query 6', linewidth=2)
		plt.plot(x,query7_tot,  marker='', color='brown', label='Query 7', linewidth=2)
		plt.plot(x,query8_tot,  marker='', color='yellow', label='Query 8', linewidth=2)
		plt.plot(x,query9_tot,  marker='', color='silver',label='Query 9', linewidth=2)
		plt.plot(x,query10_tot,  marker='', color='green', label='Query 10',linewidth=2)

		plt.legend(fontsize=9)
		plt.ylabel('Time (seconds)', fontsize=18)
		plt.xlabel('# Changes', fontsize=18)

		plt.savefig(path+"Scalability.pdf", bbox_inches='tight')

		plt.close()

	

plot_method('Java')
#plot_method('JavaScript')
#plot_method('Python')

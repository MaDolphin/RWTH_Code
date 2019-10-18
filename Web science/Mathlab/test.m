% rand(8)*100
res = round(rand(8)*99+1)
max(res)
max(res,[],2)
max(max(res,[],1),[],2)
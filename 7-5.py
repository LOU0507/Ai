# 7-4깊은다층퍼셉트론으로MINIST인식하기(SGD와Adam의성능그래프비교)

import numpy as np
import tensorflow as tf
import tensorflow.keras.datasets as ds
import matplotlib.pyplot as plt

from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense
from tensorflow.keras.optimizers import SGD,Adam


# 1단계 데이터를 준비한다
( x_train, y_train), (x_test, y_test) = ds.mnist.load_data()
print('!!!!',x_train.shape,y_train.shape,x_test.shape,y_test.shape)

x_train = x_train.reshape( 60000, 784)
x_test=x_test.reshape( 10000, 784)
x_train = x_train.astype(np.float32)/255.0
x_test = x_test.astype(np.float32) / 255.0
y_train = tf.keras.utils.to_categorical( y_train, 10)
y_test = tf.keras.utils.to_categorical( y_test, 10 )


# 2단계 모델을 선택하고 (신경망 구조를 설계한다)
dmlp = Sequential()
dmlp.add( Dense(units = 512, activation='relu', input_shape = (784,)))
dmlp.add( Dense( units=512, activation='relu'))
dmlp.add( Dense( units=512, activation='relu'))
dmlp.add( Dense( units=10, activation='softmax'))

# 3단계 학습한다
dmlp.compile( loss='categorical_crossentropy', optimizer=Adam(learning_rate = 0.0001),
             metrics=['accuracy'])
hist = dmlp.fit( x_train, y_train, batch_size=128, epochs=50, 
         validation_data=(x_test, y_test), verbose=2)
print('Adam 정확률=',dmlp.evaluate(x_test,y_test,verbose=0)[1]*100)


plt.plot(hist.history['accuracy'])
plt.plot(hist.history['val_accuracy'])
plt.title('Accuracy graph')
plt.xlabel('epochs')
plt.ylabel('accuracy')
plt.legend(['train','test'])
plt.grid()
plt.show()

plt.plot(hist.history['loss'])
plt.plot(hist.history['val_loss'])
plt.title('Loss graph')
plt.xlabel('epochs')
plt.ylabel('loss')
plt.legend(['train','test'])
plt.grid()
plt.show()

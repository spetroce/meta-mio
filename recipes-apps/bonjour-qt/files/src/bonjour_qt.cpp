#include <QCoreApplication>
#include <QDebug>

int main(int argc, char *argv[]) {
  QCoreApplication a(argc, argv);
    
  qDebug() << "Bonjour Qt!";

  return a.exec();
}


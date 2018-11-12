# schemeMater
H5唤起应用，服务器通过超链接的方式唤起
本Demo提供演示地址 http://gylmvip.club/github/h5-scheme.html
通过手机客端浏览器访问本地址

AndroidManifest.xml文件添加以下配置信息

<!--<a href="[scheme]://[host]/[path]?[query]"> 唤起应用 </a>-->
  <!--要想成功调起App，必须添加intent过滤器-->
            <intent-filter>
                <!--协议部分，随便设置-->
                <!--下面这几行也必须得设置-->
                <action android:name="android.intent.action.VIEW" />

                <category android:name="android.intent.category.BROWSABLE" />
                <category android:name="android.intent.category.DEFAULT" />

                <data
                    android:host="xd"
                    android:path="/result"
                    android:port="8080"
                    android:scheme="wuwen" />
            </intent-filter>

package eu.xenit.testing.ditto.api.data;

import eu.xenit.testing.ditto.api.model.Namespace;
import eu.xenit.testing.ditto.api.model.QName;

public interface ContentModel {

    interface Content {

        Namespace NAMESPACE = Namespace.createNamespace("http://www.alfresco.org/model/content/1.0", "cm");

        QName FOLDER = createQName("folder");
        QName CONTENT = createQName("content");

        QName TITLED = createQName("titled");
        QName TITLE = createQName("title");
        QName DESCRIPTION = createQName("description");

        QName AUDITABLE = createQName("auditable");
        QName NAME = createQName("name");

        QName CREATOR = createQName("creator");
        QName CREATED = createQName("created");
        QName MODIFIER = createQName("modifier");
        QName MODIFIED = createQName("modified");

        QName OWNER = createQName("owner");

        static QName createQName(String localName) {
            return QName.createQName(NAMESPACE, localName);
        }
    }

    interface System {

        Namespace NAMESPACE = Namespace.createNamespace("http://www.alfresco.org/model/system/1.0", "sys");

        QName STORE_ROOT = createQName("store_root");
        QName CONTAINER = createQName("container");

        QName NODE_DBID = createQName("node-dbid");

        QName STORE_PROTOCOL = createQName("store-protocol");
        QName STORE_IDENTIFIER = createQName("store-identifier");
        QName NODE_UUID = createQName("node-uuid");

        QName LOCALE = createQName("locale");

        static QName createQName(String localName) {
            return QName.createQName(NAMESPACE, localName);
        }
    }

    interface User {
        Namespace NAMESPACE = Namespace.createNamespace("http://www.alfresco.org/model/user/1.0", "usr");

        QName USER = createQName("user");
        QName USERNAME = createQName("username");

        static QName createQName(String localName) {
            return QName.createQName(NAMESPACE, localName);
        }
    }

}


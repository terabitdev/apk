package io.elevenlabs.readerapp.core.router;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/core/router/PendingShare;", "", "<init>", "()V", "Text", "Link", "File", "Images", "Lio/elevenlabs/readerapp/core/router/PendingShare$File;", "Lio/elevenlabs/readerapp/core/router/PendingShare$Images;", "Lio/elevenlabs/readerapp/core/router/PendingShare$Link;", "Lio/elevenlabs/readerapp/core/router/PendingShare$Text;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public abstract class PendingShare {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/core/router/PendingShare$File;", "Lio/elevenlabs/readerapp/core/router/PendingShare;", "uri", "", "<init>", "(Ljava/lang/String;)V", "getUri", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class File extends PendingShare {
        public static final int $stable = 0;
        private final String uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public File(String str) {
            super(null);
            str.getClass();
            this.uri = str;
        }

        public static /* synthetic */ File copy$default(File file, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = file.uri;
            }
            return file.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        public final File copy(String uri) {
            uri.getClass();
            return new File(uri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof File) && kotlin.jvm.internal.m.c(this.uri, ((File) other).uri)) {
                return true;
            }
            return false;
        }

        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public String toString() {
            return defpackage.f.C("File(uri=", this.uri, Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/core/router/PendingShare$Images;", "Lio/elevenlabs/readerapp/core/router/PendingShare;", "uris", "", "", "<init>", "(Ljava/util/List;)V", "getUris", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Images extends PendingShare {
        public static final int $stable = 8;
        private final List<String> uris;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Images(List<String> list) {
            super(null);
            list.getClass();
            this.uris = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Images copy$default(Images images, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = images.uris;
            }
            return images.copy(list);
        }

        public final List<String> component1() {
            return this.uris;
        }

        public final Images copy(List<String> uris) {
            uris.getClass();
            return new Images(uris);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Images) && kotlin.jvm.internal.m.c(this.uris, ((Images) other).uris)) {
                return true;
            }
            return false;
        }

        public final List<String> getUris() {
            return this.uris;
        }

        public int hashCode() {
            return this.uris.hashCode();
        }

        public String toString() {
            return ib.i.k("Images(uris=", Separators.RPAREN, this.uris);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/core/router/PendingShare$Link;", "Lio/elevenlabs/readerapp/core/router/PendingShare;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Link extends PendingShare {
        public static final int $stable = 0;
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Link(String str) {
            super(null);
            str.getClass();
            this.url = str;
        }

        public static /* synthetic */ Link copy$default(Link link, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = link.url;
            }
            return link.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final Link copy(String url) {
            url.getClass();
            return new Link(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Link) && kotlin.jvm.internal.m.c(this.url, ((Link) other).url)) {
                return true;
            }
            return false;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return defpackage.f.C("Link(url=", this.url, Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/readerapp/core/router/PendingShare$Text;", "Lio/elevenlabs/readerapp/core/router/PendingShare;", "title", "", ParameterNames.TEXT, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Text extends PendingShare {
        public static final int $stable = 0;
        private final String text;
        private final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(String str, String str2) {
            super(null);
            str2.getClass();
            this.title = str;
            this.text = str2;
        }

        public static /* synthetic */ Text copy$default(Text text, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = text.title;
            }
            if ((i10 & 2) != 0) {
                str2 = text.text;
            }
            return text.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Text copy(String title, String text) {
            text.getClass();
            return new Text(title, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            if (kotlin.jvm.internal.m.c(this.title, text.title) && kotlin.jvm.internal.m.c(this.text, text.text)) {
                return true;
            }
            return false;
        }

        public final String getText() {
            return this.text;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode;
            String str = this.title;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return this.text.hashCode() + (hashCode * 31);
        }

        public String toString() {
            return z.h.c("Text(title=", this.title, ", text=", this.text, Separators.RPAREN);
        }
    }

    public /* synthetic */ PendingShare(kotlin.jvm.internal.f fVar) {
        this();
    }

    private PendingShare() {
    }
}

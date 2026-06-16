package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/SelectedFile;", "", "uri", "", DiagnosticsEntry.NAME_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUri", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class SelectedFile {
    public static final int $stable = 0;
    private final String name;
    private final String uri;

    public SelectedFile(String str, String str2) {
        str.getClass();
        this.uri = str;
        this.name = str2;
    }

    public static /* synthetic */ SelectedFile copy$default(SelectedFile selectedFile, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = selectedFile.uri;
        }
        if ((i10 & 2) != 0) {
            str2 = selectedFile.name;
        }
        return selectedFile.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final SelectedFile copy(String uri, String name) {
        uri.getClass();
        return new SelectedFile(uri, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedFile)) {
            return false;
        }
        SelectedFile selectedFile = (SelectedFile) other;
        if (kotlin.jvm.internal.m.c(this.uri, selectedFile.uri) && kotlin.jvm.internal.m.c(this.name, selectedFile.name)) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.uri.hashCode() * 31;
        String str = this.name;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return z.h.c("SelectedFile(uri=", this.uri, ", name=", this.name, Separators.RPAREN);
    }

    public /* synthetic */ SelectedFile(String str, String str2, int i10, kotlin.jvm.internal.f fVar) {
        this(str, (i10 & 2) != 0 ? null : str2);
    }
}

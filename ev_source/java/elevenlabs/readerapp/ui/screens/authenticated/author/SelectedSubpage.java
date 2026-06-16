package io.elevenlabs.readerapp.ui.screens.authenticated.author;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/author/SelectedSubpage;", "", "id", "", FirebaseAnalytics.Param.INDEX, "", "<init>", "(Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class SelectedSubpage {
    public static final int $stable = 0;
    private final String id;
    private final int index;

    public SelectedSubpage(String str, int i10) {
        str.getClass();
        this.id = str;
        this.index = i10;
    }

    public static /* synthetic */ SelectedSubpage copy$default(SelectedSubpage selectedSubpage, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = selectedSubpage.id;
        }
        if ((i11 & 2) != 0) {
            i10 = selectedSubpage.index;
        }
        return selectedSubpage.copy(str, i10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final SelectedSubpage copy(String id2, int index) {
        id2.getClass();
        return new SelectedSubpage(id2, index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedSubpage)) {
            return false;
        }
        SelectedSubpage selectedSubpage = (SelectedSubpage) other;
        if (kotlin.jvm.internal.m.c(this.id, selectedSubpage.id) && this.index == selectedSubpage.index) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return Integer.hashCode(this.index) + (this.id.hashCode() * 31);
    }

    public String toString() {
        return "SelectedSubpage(id=" + this.id + ", index=" + this.index + Separators.RPAREN;
    }
}

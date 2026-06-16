package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.Bookmark;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/ReadBookmarksState;", "", "readId", "", "readTitle", "bookmarks", "", "Lio/elevenlabs/domain/model/Bookmark;", "isDownloading", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "getReadId", "()Ljava/lang/String;", "getReadTitle", "getBookmarks", "()Ljava/util/List;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ReadBookmarksState {
    public static final int $stable = 8;
    private final List<Bookmark> bookmarks;
    private final boolean isDownloading;
    private final String readId;
    private final String readTitle;

    public /* synthetic */ ReadBookmarksState(String str, String str2, List list, boolean z6, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? tn.t.f33547a : list, (i10 & 8) != 0 ? false : z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReadBookmarksState copy$default(ReadBookmarksState readBookmarksState, String str, String str2, List list, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = readBookmarksState.readId;
        }
        if ((i10 & 2) != 0) {
            str2 = readBookmarksState.readTitle;
        }
        if ((i10 & 4) != 0) {
            list = readBookmarksState.bookmarks;
        }
        if ((i10 & 8) != 0) {
            z6 = readBookmarksState.isDownloading;
        }
        return readBookmarksState.copy(str, str2, list, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReadTitle() {
        return this.readTitle;
    }

    public final List<Bookmark> component3() {
        return this.bookmarks;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsDownloading() {
        return this.isDownloading;
    }

    public final ReadBookmarksState copy(String readId, String readTitle, List<Bookmark> bookmarks, boolean isDownloading) {
        readId.getClass();
        readTitle.getClass();
        bookmarks.getClass();
        return new ReadBookmarksState(readId, readTitle, bookmarks, isDownloading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadBookmarksState)) {
            return false;
        }
        ReadBookmarksState readBookmarksState = (ReadBookmarksState) other;
        if (kotlin.jvm.internal.m.c(this.readId, readBookmarksState.readId) && kotlin.jvm.internal.m.c(this.readTitle, readBookmarksState.readTitle) && kotlin.jvm.internal.m.c(this.bookmarks, readBookmarksState.bookmarks) && this.isDownloading == readBookmarksState.isDownloading) {
            return true;
        }
        return false;
    }

    public final List<Bookmark> getBookmarks() {
        return this.bookmarks;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final String getReadTitle() {
        return this.readTitle;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isDownloading) + p.n.d(j0.c.c(this.readId.hashCode() * 31, 31, this.readTitle), 31, this.bookmarks);
    }

    public final boolean isDownloading() {
        return this.isDownloading;
    }

    public String toString() {
        String str = this.readId;
        String str2 = this.readTitle;
        List<Bookmark> list = this.bookmarks;
        boolean z6 = this.isDownloading;
        StringBuilder s10 = defpackage.f.s("ReadBookmarksState(readId=", str, ", readTitle=", str2, ", bookmarks=");
        s10.append(list);
        s10.append(", isDownloading=");
        s10.append(z6);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    public ReadBookmarksState(String str, String str2, List<Bookmark> list, boolean z6) {
        j0.c.w(str, str2, list);
        this.readId = str;
        this.readTitle = str2;
        this.bookmarks = list;
        this.isDownloading = z6;
    }

    public ReadBookmarksState() {
        this(null, null, null, false, 15, null);
    }
}

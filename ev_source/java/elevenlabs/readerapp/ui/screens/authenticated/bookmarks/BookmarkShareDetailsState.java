package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import java.io.File;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/bookmarks/BookmarkShareDetailsState;", "", "isLoading", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "videoFile", "Ljava/io/File;", "isUserImportedRead", "isDisclaimerShown", "pendingBookmarkShareAction", "Lio/elevenlabs/readerapp/ui/screens/authenticated/bookmarks/BookmarkShareAction;", "<init>", "(ZLjava/lang/String;Ljava/io/File;ZZLio/elevenlabs/readerapp/ui/screens/authenticated/bookmarks/BookmarkShareAction;)V", "()Z", "getError", "()Ljava/lang/String;", "getVideoFile", "()Ljava/io/File;", "getPendingBookmarkShareAction", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/bookmarks/BookmarkShareAction;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class BookmarkShareDetailsState {
    public static final int $stable = 8;
    private final String error;
    private final boolean isDisclaimerShown;
    private final boolean isLoading;
    private final boolean isUserImportedRead;
    private final BookmarkShareAction pendingBookmarkShareAction;
    private final File videoFile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BookmarkShareDetailsState(boolean z6, String str, File file, boolean z10, boolean z11, BookmarkShareAction bookmarkShareAction, int i10, kotlin.jvm.internal.f fVar) {
        this(z6, str, file, z10, z11, r9);
        BookmarkShareAction bookmarkShareAction2;
        z6 = (i10 & 1) != 0 ? false : z6;
        str = (i10 & 2) != 0 ? "" : str;
        file = (i10 & 4) != 0 ? null : file;
        z10 = (i10 & 8) != 0 ? false : z10;
        z11 = (i10 & 16) != 0 ? false : z11;
        if ((i10 & 32) != 0) {
            bookmarkShareAction2 = null;
        } else {
            bookmarkShareAction2 = bookmarkShareAction;
        }
    }

    public static /* synthetic */ BookmarkShareDetailsState copy$default(BookmarkShareDetailsState bookmarkShareDetailsState, boolean z6, String str, File file, boolean z10, boolean z11, BookmarkShareAction bookmarkShareAction, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = bookmarkShareDetailsState.isLoading;
        }
        if ((i10 & 2) != 0) {
            str = bookmarkShareDetailsState.error;
        }
        if ((i10 & 4) != 0) {
            file = bookmarkShareDetailsState.videoFile;
        }
        if ((i10 & 8) != 0) {
            z10 = bookmarkShareDetailsState.isUserImportedRead;
        }
        if ((i10 & 16) != 0) {
            z11 = bookmarkShareDetailsState.isDisclaimerShown;
        }
        if ((i10 & 32) != 0) {
            bookmarkShareAction = bookmarkShareDetailsState.pendingBookmarkShareAction;
        }
        boolean z12 = z11;
        BookmarkShareAction bookmarkShareAction2 = bookmarkShareAction;
        return bookmarkShareDetailsState.copy(z6, str, file, z10, z12, bookmarkShareAction2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final File getVideoFile() {
        return this.videoFile;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsUserImportedRead() {
        return this.isUserImportedRead;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsDisclaimerShown() {
        return this.isDisclaimerShown;
    }

    /* renamed from: component6, reason: from getter */
    public final BookmarkShareAction getPendingBookmarkShareAction() {
        return this.pendingBookmarkShareAction;
    }

    public final BookmarkShareDetailsState copy(boolean isLoading, String error, File videoFile, boolean isUserImportedRead, boolean isDisclaimerShown, BookmarkShareAction pendingBookmarkShareAction) {
        error.getClass();
        return new BookmarkShareDetailsState(isLoading, error, videoFile, isUserImportedRead, isDisclaimerShown, pendingBookmarkShareAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookmarkShareDetailsState)) {
            return false;
        }
        BookmarkShareDetailsState bookmarkShareDetailsState = (BookmarkShareDetailsState) other;
        if (this.isLoading == bookmarkShareDetailsState.isLoading && kotlin.jvm.internal.m.c(this.error, bookmarkShareDetailsState.error) && kotlin.jvm.internal.m.c(this.videoFile, bookmarkShareDetailsState.videoFile) && this.isUserImportedRead == bookmarkShareDetailsState.isUserImportedRead && this.isDisclaimerShown == bookmarkShareDetailsState.isDisclaimerShown && this.pendingBookmarkShareAction == bookmarkShareDetailsState.pendingBookmarkShareAction) {
            return true;
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final BookmarkShareAction getPendingBookmarkShareAction() {
        return this.pendingBookmarkShareAction;
    }

    public final File getVideoFile() {
        return this.videoFile;
    }

    public int hashCode() {
        int hashCode;
        int c5 = j0.c.c(Boolean.hashCode(this.isLoading) * 31, 31, this.error);
        File file = this.videoFile;
        int i10 = 0;
        if (file == null) {
            hashCode = 0;
        } else {
            hashCode = file.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((c5 + hashCode) * 31, 31, this.isUserImportedRead), 31, this.isDisclaimerShown);
        BookmarkShareAction bookmarkShareAction = this.pendingBookmarkShareAction;
        if (bookmarkShareAction != null) {
            i10 = bookmarkShareAction.hashCode();
        }
        return f10 + i10;
    }

    public final boolean isDisclaimerShown() {
        return this.isDisclaimerShown;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isUserImportedRead() {
        return this.isUserImportedRead;
    }

    public String toString() {
        return "BookmarkShareDetailsState(isLoading=" + this.isLoading + ", error=" + this.error + ", videoFile=" + this.videoFile + ", isUserImportedRead=" + this.isUserImportedRead + ", isDisclaimerShown=" + this.isDisclaimerShown + ", pendingBookmarkShareAction=" + this.pendingBookmarkShareAction + Separators.RPAREN;
    }

    public BookmarkShareDetailsState(boolean z6, String str, File file, boolean z10, boolean z11, BookmarkShareAction bookmarkShareAction) {
        str.getClass();
        this.isLoading = z6;
        this.error = str;
        this.videoFile = file;
        this.isUserImportedRead = z10;
        this.isDisclaimerShown = z11;
        this.pendingBookmarkShareAction = bookmarkShareAction;
    }

    public BookmarkShareDetailsState() {
        this(false, null, null, false, false, null, 63, null);
    }
}

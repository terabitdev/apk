package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.LimitReachedData;
import io.elevenlabs.domain.model.ReadMeta;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003JU\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0007HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0012¨\u0006'"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportFileState;", "", "file", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/SelectedFile;", "isLoading", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "navigateToRead", "Lio/elevenlabs/domain/model/ReadMeta;", "navigateToAddPodcastLimitReached", "Lio/elevenlabs/domain/model/LimitReachedData;", "navigateClose", "isPodcastMode", "<init>", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/SelectedFile;ZLjava/lang/String;Lio/elevenlabs/domain/model/ReadMeta;Lio/elevenlabs/domain/model/LimitReachedData;ZZ)V", "getFile", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/SelectedFile;", "()Z", "getError", "()Ljava/lang/String;", "getNavigateToRead", "()Lio/elevenlabs/domain/model/ReadMeta;", "getNavigateToAddPodcastLimitReached", "()Lio/elevenlabs/domain/model/LimitReachedData;", "getNavigateClose", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ImportFileState {
    public static final int $stable = 8;
    private final String error;
    private final SelectedFile file;
    private final boolean isLoading;
    private final boolean isPodcastMode;
    private final boolean navigateClose;
    private final LimitReachedData navigateToAddPodcastLimitReached;
    private final ReadMeta navigateToRead;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ImportFileState(SelectedFile selectedFile, boolean z6, String str, ReadMeta readMeta, LimitReachedData limitReachedData, boolean z10, boolean z11, int i10, kotlin.jvm.internal.f fVar) {
        this(selectedFile, z6, str, readMeta, limitReachedData, z10, r10);
        boolean z12;
        selectedFile = (i10 & 1) != 0 ? null : selectedFile;
        z6 = (i10 & 2) != 0 ? false : z6;
        str = (i10 & 4) != 0 ? "" : str;
        readMeta = (i10 & 8) != 0 ? null : readMeta;
        limitReachedData = (i10 & 16) != 0 ? null : limitReachedData;
        z10 = (i10 & 32) != 0 ? false : z10;
        if ((i10 & 64) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
    }

    public static /* synthetic */ ImportFileState copy$default(ImportFileState importFileState, SelectedFile selectedFile, boolean z6, String str, ReadMeta readMeta, LimitReachedData limitReachedData, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            selectedFile = importFileState.file;
        }
        if ((i10 & 2) != 0) {
            z6 = importFileState.isLoading;
        }
        if ((i10 & 4) != 0) {
            str = importFileState.error;
        }
        if ((i10 & 8) != 0) {
            readMeta = importFileState.navigateToRead;
        }
        if ((i10 & 16) != 0) {
            limitReachedData = importFileState.navigateToAddPodcastLimitReached;
        }
        if ((i10 & 32) != 0) {
            z10 = importFileState.navigateClose;
        }
        if ((i10 & 64) != 0) {
            z11 = importFileState.isPodcastMode;
        }
        boolean z12 = z10;
        boolean z13 = z11;
        LimitReachedData limitReachedData2 = limitReachedData;
        String str2 = str;
        return importFileState.copy(selectedFile, z6, str2, readMeta, limitReachedData2, z12, z13);
    }

    /* renamed from: component1, reason: from getter */
    public final SelectedFile getFile() {
        return this.file;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final ReadMeta getNavigateToRead() {
        return this.navigateToRead;
    }

    /* renamed from: component5, reason: from getter */
    public final LimitReachedData getNavigateToAddPodcastLimitReached() {
        return this.navigateToAddPodcastLimitReached;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getNavigateClose() {
        return this.navigateClose;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsPodcastMode() {
        return this.isPodcastMode;
    }

    public final ImportFileState copy(SelectedFile file, boolean isLoading, String error, ReadMeta navigateToRead, LimitReachedData navigateToAddPodcastLimitReached, boolean navigateClose, boolean isPodcastMode) {
        error.getClass();
        return new ImportFileState(file, isLoading, error, navigateToRead, navigateToAddPodcastLimitReached, navigateClose, isPodcastMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImportFileState)) {
            return false;
        }
        ImportFileState importFileState = (ImportFileState) other;
        if (kotlin.jvm.internal.m.c(this.file, importFileState.file) && this.isLoading == importFileState.isLoading && kotlin.jvm.internal.m.c(this.error, importFileState.error) && kotlin.jvm.internal.m.c(this.navigateToRead, importFileState.navigateToRead) && kotlin.jvm.internal.m.c(this.navigateToAddPodcastLimitReached, importFileState.navigateToAddPodcastLimitReached) && this.navigateClose == importFileState.navigateClose && this.isPodcastMode == importFileState.isPodcastMode) {
            return true;
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final SelectedFile getFile() {
        return this.file;
    }

    public final boolean getNavigateClose() {
        return this.navigateClose;
    }

    public final LimitReachedData getNavigateToAddPodcastLimitReached() {
        return this.navigateToAddPodcastLimitReached;
    }

    public final ReadMeta getNavigateToRead() {
        return this.navigateToRead;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        SelectedFile selectedFile = this.file;
        int i10 = 0;
        if (selectedFile == null) {
            hashCode = 0;
        } else {
            hashCode = selectedFile.hashCode();
        }
        int c5 = j0.c.c(com.google.android.gms.internal.play_billing.b.f(hashCode * 31, 31, this.isLoading), 31, this.error);
        ReadMeta readMeta = this.navigateToRead;
        if (readMeta == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = readMeta.hashCode();
        }
        int i11 = (c5 + hashCode2) * 31;
        LimitReachedData limitReachedData = this.navigateToAddPodcastLimitReached;
        if (limitReachedData != null) {
            i10 = limitReachedData.hashCode();
        }
        return Boolean.hashCode(this.isPodcastMode) + com.google.android.gms.internal.play_billing.b.f((i11 + i10) * 31, 31, this.navigateClose);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isPodcastMode() {
        return this.isPodcastMode;
    }

    public String toString() {
        SelectedFile selectedFile = this.file;
        boolean z6 = this.isLoading;
        String str = this.error;
        ReadMeta readMeta = this.navigateToRead;
        LimitReachedData limitReachedData = this.navigateToAddPodcastLimitReached;
        boolean z10 = this.navigateClose;
        boolean z11 = this.isPodcastMode;
        StringBuilder sb = new StringBuilder("ImportFileState(file=");
        sb.append(selectedFile);
        sb.append(", isLoading=");
        sb.append(z6);
        sb.append(", error=");
        sb.append(str);
        sb.append(", navigateToRead=");
        sb.append(readMeta);
        sb.append(", navigateToAddPodcastLimitReached=");
        sb.append(limitReachedData);
        sb.append(", navigateClose=");
        sb.append(z10);
        sb.append(", isPodcastMode=");
        return p.n.j(Separators.RPAREN, sb, z11);
    }

    public ImportFileState(SelectedFile selectedFile, boolean z6, String str, ReadMeta readMeta, LimitReachedData limitReachedData, boolean z10, boolean z11) {
        str.getClass();
        this.file = selectedFile;
        this.isLoading = z6;
        this.error = str;
        this.navigateToRead = readMeta;
        this.navigateToAddPodcastLimitReached = limitReachedData;
        this.navigateClose = z10;
        this.isPodcastMode = z11;
    }

    public ImportFileState() {
        this(null, false, null, null, null, false, false, 127, null);
    }
}

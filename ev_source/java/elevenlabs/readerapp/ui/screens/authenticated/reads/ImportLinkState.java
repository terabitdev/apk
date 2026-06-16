package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.LimitReachedData;
import io.elevenlabs.domain.model.ReadMeta;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J_\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0014\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0010¨\u0006("}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportLinkState;", "", "isLoading", "", "url", "", "navigateToRead", "Lio/elevenlabs/domain/model/ReadMeta;", "navigateToAddPodcastLimitReached", "Lio/elevenlabs/domain/model/LimitReachedData;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "reload", "triggerProcess", "isPodcastMode", "<init>", "(ZLjava/lang/String;Lio/elevenlabs/domain/model/ReadMeta;Lio/elevenlabs/domain/model/LimitReachedData;Ljava/lang/String;ZZZ)V", "()Z", "getUrl", "()Ljava/lang/String;", "getNavigateToRead", "()Lio/elevenlabs/domain/model/ReadMeta;", "getNavigateToAddPodcastLimitReached", "()Lio/elevenlabs/domain/model/LimitReachedData;", "getError", "getReload", "getTriggerProcess", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ImportLinkState {
    public static final int $stable = 8;
    private final String error;
    private final boolean isLoading;
    private final boolean isPodcastMode;
    private final LimitReachedData navigateToAddPodcastLimitReached;
    private final ReadMeta navigateToRead;
    private final boolean reload;
    private final boolean triggerProcess;
    private final String url;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ImportLinkState(boolean r2, java.lang.String r3, io.elevenlabs.domain.model.ReadMeta r4, io.elevenlabs.domain.model.LimitReachedData r5, java.lang.String r6, boolean r7, boolean r8, boolean r9, int r10, kotlin.jvm.internal.f r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L5
            r2 = 1
        L5:
            r11 = r10 & 2
            r0 = 0
            if (r11 == 0) goto Lb
            r3 = r0
        Lb:
            r11 = r10 & 4
            if (r11 == 0) goto L10
            r4 = r0
        L10:
            r11 = r10 & 8
            if (r11 == 0) goto L15
            r5 = r0
        L15:
            r11 = r10 & 16
            if (r11 == 0) goto L1b
            java.lang.String r6 = ""
        L1b:
            r11 = r10 & 32
            r0 = 0
            if (r11 == 0) goto L21
            r7 = r0
        L21:
            r11 = r10 & 64
            if (r11 == 0) goto L26
            r8 = r0
        L26:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L34
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L3d
        L34:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L3d:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportLinkState.<init>(boolean, java.lang.String, io.elevenlabs.domain.model.ReadMeta, io.elevenlabs.domain.model.LimitReachedData, java.lang.String, boolean, boolean, boolean, int, kotlin.jvm.internal.f):void");
    }

    public static /* synthetic */ ImportLinkState copy$default(ImportLinkState importLinkState, boolean z6, String str, ReadMeta readMeta, LimitReachedData limitReachedData, String str2, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = importLinkState.isLoading;
        }
        if ((i10 & 2) != 0) {
            str = importLinkState.url;
        }
        if ((i10 & 4) != 0) {
            readMeta = importLinkState.navigateToRead;
        }
        if ((i10 & 8) != 0) {
            limitReachedData = importLinkState.navigateToAddPodcastLimitReached;
        }
        if ((i10 & 16) != 0) {
            str2 = importLinkState.error;
        }
        if ((i10 & 32) != 0) {
            z10 = importLinkState.reload;
        }
        if ((i10 & 64) != 0) {
            z11 = importLinkState.triggerProcess;
        }
        if ((i10 & 128) != 0) {
            z12 = importLinkState.isPodcastMode;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        String str3 = str2;
        boolean z15 = z10;
        return importLinkState.copy(z6, str, readMeta, limitReachedData, str3, z15, z13, z14);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final ReadMeta getNavigateToRead() {
        return this.navigateToRead;
    }

    /* renamed from: component4, reason: from getter */
    public final LimitReachedData getNavigateToAddPodcastLimitReached() {
        return this.navigateToAddPodcastLimitReached;
    }

    /* renamed from: component5, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getReload() {
        return this.reload;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getTriggerProcess() {
        return this.triggerProcess;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsPodcastMode() {
        return this.isPodcastMode;
    }

    public final ImportLinkState copy(boolean isLoading, String url, ReadMeta navigateToRead, LimitReachedData navigateToAddPodcastLimitReached, String error, boolean reload, boolean triggerProcess, boolean isPodcastMode) {
        error.getClass();
        return new ImportLinkState(isLoading, url, navigateToRead, navigateToAddPodcastLimitReached, error, reload, triggerProcess, isPodcastMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImportLinkState)) {
            return false;
        }
        ImportLinkState importLinkState = (ImportLinkState) other;
        if (this.isLoading == importLinkState.isLoading && kotlin.jvm.internal.m.c(this.url, importLinkState.url) && kotlin.jvm.internal.m.c(this.navigateToRead, importLinkState.navigateToRead) && kotlin.jvm.internal.m.c(this.navigateToAddPodcastLimitReached, importLinkState.navigateToAddPodcastLimitReached) && kotlin.jvm.internal.m.c(this.error, importLinkState.error) && this.reload == importLinkState.reload && this.triggerProcess == importLinkState.triggerProcess && this.isPodcastMode == importLinkState.isPodcastMode) {
            return true;
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final LimitReachedData getNavigateToAddPodcastLimitReached() {
        return this.navigateToAddPodcastLimitReached;
    }

    public final ReadMeta getNavigateToRead() {
        return this.navigateToRead;
    }

    public final boolean getReload() {
        return this.reload;
    }

    public final boolean getTriggerProcess() {
        return this.triggerProcess;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = Boolean.hashCode(this.isLoading) * 31;
        String str = this.url;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode3 + hashCode) * 31;
        ReadMeta readMeta = this.navigateToRead;
        if (readMeta == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = readMeta.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        LimitReachedData limitReachedData = this.navigateToAddPodcastLimitReached;
        if (limitReachedData != null) {
            i10 = limitReachedData.hashCode();
        }
        return Boolean.hashCode(this.isPodcastMode) + com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(j0.c.c((i12 + i10) * 31, 31, this.error), 31, this.reload), 31, this.triggerProcess);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isPodcastMode() {
        return this.isPodcastMode;
    }

    public String toString() {
        boolean z6 = this.isLoading;
        String str = this.url;
        ReadMeta readMeta = this.navigateToRead;
        LimitReachedData limitReachedData = this.navigateToAddPodcastLimitReached;
        String str2 = this.error;
        boolean z10 = this.reload;
        boolean z11 = this.triggerProcess;
        boolean z12 = this.isPodcastMode;
        StringBuilder sb = new StringBuilder("ImportLinkState(isLoading=");
        sb.append(z6);
        sb.append(", url=");
        sb.append(str);
        sb.append(", navigateToRead=");
        sb.append(readMeta);
        sb.append(", navigateToAddPodcastLimitReached=");
        sb.append(limitReachedData);
        sb.append(", error=");
        defpackage.f.y(sb, str2, ", reload=", z10, ", triggerProcess=");
        sb.append(z11);
        sb.append(", isPodcastMode=");
        sb.append(z12);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public ImportLinkState(boolean z6, String str, ReadMeta readMeta, LimitReachedData limitReachedData, String str2, boolean z10, boolean z11, boolean z12) {
        str2.getClass();
        this.isLoading = z6;
        this.url = str;
        this.navigateToRead = readMeta;
        this.navigateToAddPodcastLimitReached = limitReachedData;
        this.error = str2;
        this.reload = z10;
        this.triggerProcess = z11;
        this.isPodcastMode = z12;
    }

    public ImportLinkState() {
        this(false, null, null, null, null, false, false, false, 255, null);
    }
}

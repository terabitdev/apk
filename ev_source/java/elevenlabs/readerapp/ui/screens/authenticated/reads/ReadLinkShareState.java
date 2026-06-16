package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadShareResult;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadLinkShareState;", "", "isLoading", "", "read", "Lio/elevenlabs/domain/model/ReadMeta;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/ReadShareResult;", "shareOption", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadLinkShareOption;", "<init>", "(ZLio/elevenlabs/domain/model/ReadMeta;Ljava/lang/String;Lio/elevenlabs/domain/model/ReadShareResult;Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadLinkShareOption;)V", "()Z", "getRead", "()Lio/elevenlabs/domain/model/ReadMeta;", "getError", "()Ljava/lang/String;", "getData", "()Lio/elevenlabs/domain/model/ReadShareResult;", "getShareOption", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadLinkShareOption;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ReadLinkShareState {
    public static final int $stable = 8;
    private final ReadShareResult data;
    private final String error;
    private final boolean isLoading;
    private final ReadMeta read;
    private final ReadLinkShareOption shareOption;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ReadLinkShareState(boolean r2, io.elevenlabs.domain.model.ReadMeta r3, java.lang.String r4, io.elevenlabs.domain.model.ReadShareResult r5, io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadLinkShareOption r6, int r7, kotlin.jvm.internal.f r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r2 = 0
        L5:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lb
            r3 = r0
        Lb:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            java.lang.String r4 = ""
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L16
            r5 = r0
        L16:
            r7 = r7 & 16
            if (r7 == 0) goto L21
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L27
        L21:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L27:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadLinkShareState.<init>(boolean, io.elevenlabs.domain.model.ReadMeta, java.lang.String, io.elevenlabs.domain.model.ReadShareResult, io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadLinkShareOption, int, kotlin.jvm.internal.f):void");
    }

    public static /* synthetic */ ReadLinkShareState copy$default(ReadLinkShareState readLinkShareState, boolean z6, ReadMeta readMeta, String str, ReadShareResult readShareResult, ReadLinkShareOption readLinkShareOption, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = readLinkShareState.isLoading;
        }
        if ((i10 & 2) != 0) {
            readMeta = readLinkShareState.read;
        }
        if ((i10 & 4) != 0) {
            str = readLinkShareState.error;
        }
        if ((i10 & 8) != 0) {
            readShareResult = readLinkShareState.data;
        }
        if ((i10 & 16) != 0) {
            readLinkShareOption = readLinkShareState.shareOption;
        }
        ReadLinkShareOption readLinkShareOption2 = readLinkShareOption;
        String str2 = str;
        return readLinkShareState.copy(z6, readMeta, str2, readShareResult, readLinkShareOption2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final ReadMeta getRead() {
        return this.read;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final ReadShareResult getData() {
        return this.data;
    }

    /* renamed from: component5, reason: from getter */
    public final ReadLinkShareOption getShareOption() {
        return this.shareOption;
    }

    public final ReadLinkShareState copy(boolean isLoading, ReadMeta read, String error, ReadShareResult data, ReadLinkShareOption shareOption) {
        error.getClass();
        return new ReadLinkShareState(isLoading, read, error, data, shareOption);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadLinkShareState)) {
            return false;
        }
        ReadLinkShareState readLinkShareState = (ReadLinkShareState) other;
        if (this.isLoading == readLinkShareState.isLoading && kotlin.jvm.internal.m.c(this.read, readLinkShareState.read) && kotlin.jvm.internal.m.c(this.error, readLinkShareState.error) && kotlin.jvm.internal.m.c(this.data, readLinkShareState.data) && this.shareOption == readLinkShareState.shareOption) {
            return true;
        }
        return false;
    }

    public final ReadShareResult getData() {
        return this.data;
    }

    public final String getError() {
        return this.error;
    }

    public final ReadMeta getRead() {
        return this.read;
    }

    public final ReadLinkShareOption getShareOption() {
        return this.shareOption;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = Boolean.hashCode(this.isLoading) * 31;
        ReadMeta readMeta = this.read;
        int i10 = 0;
        if (readMeta == null) {
            hashCode = 0;
        } else {
            hashCode = readMeta.hashCode();
        }
        int c5 = j0.c.c((hashCode3 + hashCode) * 31, 31, this.error);
        ReadShareResult readShareResult = this.data;
        if (readShareResult == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = readShareResult.hashCode();
        }
        int i11 = (c5 + hashCode2) * 31;
        ReadLinkShareOption readLinkShareOption = this.shareOption;
        if (readLinkShareOption != null) {
            i10 = readLinkShareOption.hashCode();
        }
        return i11 + i10;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "ReadLinkShareState(isLoading=" + this.isLoading + ", read=" + this.read + ", error=" + this.error + ", data=" + this.data + ", shareOption=" + this.shareOption + Separators.RPAREN;
    }

    public ReadLinkShareState(boolean z6, ReadMeta readMeta, String str, ReadShareResult readShareResult, ReadLinkShareOption readLinkShareOption) {
        str.getClass();
        this.isLoading = z6;
        this.read = readMeta;
        this.error = str;
        this.data = readShareResult;
        this.shareOption = readLinkShareOption;
    }

    public ReadLinkShareState() {
        this(false, null, null, null, null, 31, null);
    }
}

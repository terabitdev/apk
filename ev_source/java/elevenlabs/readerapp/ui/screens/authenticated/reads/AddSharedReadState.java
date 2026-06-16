package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/AddSharedReadState;", "", "isLoading", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "ownerId", "readId", "navigateToPlayerWithReadId", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getError", "()Ljava/lang/String;", "getOwnerId", "getReadId", "getNavigateToPlayerWithReadId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class AddSharedReadState {
    public static final int $stable = 0;
    private final String error;
    private final boolean isLoading;
    private final String navigateToPlayerWithReadId;
    private final String ownerId;
    private final String readId;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ AddSharedReadState(boolean r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.f r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r2 = 0
        L5:
            r8 = r7 & 2
            if (r8 == 0) goto Lb
            java.lang.String r3 = ""
        Lb:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L11
            r4 = r0
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
        throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.readerapp.ui.screens.authenticated.reads.AddSharedReadState.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.f):void");
    }

    public static /* synthetic */ AddSharedReadState copy$default(AddSharedReadState addSharedReadState, boolean z6, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = addSharedReadState.isLoading;
        }
        if ((i10 & 2) != 0) {
            str = addSharedReadState.error;
        }
        if ((i10 & 4) != 0) {
            str2 = addSharedReadState.ownerId;
        }
        if ((i10 & 8) != 0) {
            str3 = addSharedReadState.readId;
        }
        if ((i10 & 16) != 0) {
            str4 = addSharedReadState.navigateToPlayerWithReadId;
        }
        String str5 = str4;
        String str6 = str2;
        return addSharedReadState.copy(z6, str, str6, str3, str5);
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
    public final String getOwnerId() {
        return this.ownerId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getNavigateToPlayerWithReadId() {
        return this.navigateToPlayerWithReadId;
    }

    public final AddSharedReadState copy(boolean isLoading, String error, String ownerId, String readId, String navigateToPlayerWithReadId) {
        error.getClass();
        return new AddSharedReadState(isLoading, error, ownerId, readId, navigateToPlayerWithReadId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddSharedReadState)) {
            return false;
        }
        AddSharedReadState addSharedReadState = (AddSharedReadState) other;
        if (this.isLoading == addSharedReadState.isLoading && kotlin.jvm.internal.m.c(this.error, addSharedReadState.error) && kotlin.jvm.internal.m.c(this.ownerId, addSharedReadState.ownerId) && kotlin.jvm.internal.m.c(this.readId, addSharedReadState.readId) && kotlin.jvm.internal.m.c(this.navigateToPlayerWithReadId, addSharedReadState.navigateToPlayerWithReadId)) {
            return true;
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final String getNavigateToPlayerWithReadId() {
        return this.navigateToPlayerWithReadId;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getReadId() {
        return this.readId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int c5 = j0.c.c(Boolean.hashCode(this.isLoading) * 31, 31, this.error);
        String str = this.ownerId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        String str2 = this.readId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.navigateToPlayerWithReadId;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return i12 + i10;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        boolean z6 = this.isLoading;
        String str = this.error;
        String str2 = this.ownerId;
        String str3 = this.readId;
        String str4 = this.navigateToPlayerWithReadId;
        StringBuilder sb = new StringBuilder("AddSharedReadState(isLoading=");
        sb.append(z6);
        sb.append(", error=");
        sb.append(str);
        sb.append(", ownerId=");
        defpackage.f.x(sb, str2, ", readId=", str3, ", navigateToPlayerWithReadId=");
        return defpackage.f.l(str4, Separators.RPAREN, sb);
    }

    public AddSharedReadState(boolean z6, String str, String str2, String str3, String str4) {
        str.getClass();
        this.isLoading = z6;
        this.error = str;
        this.ownerId = str2;
        this.readId = str3;
        this.navigateToPlayerWithReadId = str4;
    }

    public AddSharedReadState() {
        this(false, null, null, null, null, 31, null);
    }
}

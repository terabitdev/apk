package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/GenFMLoadingState;", "", "readId", "", "navigateToPlayer", "", "navigateBack", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "retryLoading", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Z)V", "getReadId", "()Ljava/lang/String;", "getNavigateToPlayer", "()Z", "getNavigateBack", "getError", "getRetryLoading", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class GenFMLoadingState {
    public static final int $stable = 0;
    private final String error;
    private final boolean navigateBack;
    private final boolean navigateToPlayer;
    private final String readId;
    private final boolean retryLoading;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ GenFMLoadingState(java.lang.String r2, boolean r3, boolean r4, java.lang.String r5, boolean r6, int r7, kotlin.jvm.internal.f r8) {
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
            if (r8 == 0) goto L10
            r4 = r0
        L10:
            r8 = r7 & 8
            if (r8 == 0) goto L16
            java.lang.String r5 = ""
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
        throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingState.<init>(java.lang.String, boolean, boolean, java.lang.String, boolean, int, kotlin.jvm.internal.f):void");
    }

    public static /* synthetic */ GenFMLoadingState copy$default(GenFMLoadingState genFMLoadingState, String str, boolean z6, boolean z10, String str2, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = genFMLoadingState.readId;
        }
        if ((i10 & 2) != 0) {
            z6 = genFMLoadingState.navigateToPlayer;
        }
        if ((i10 & 4) != 0) {
            z10 = genFMLoadingState.navigateBack;
        }
        if ((i10 & 8) != 0) {
            str2 = genFMLoadingState.error;
        }
        if ((i10 & 16) != 0) {
            z11 = genFMLoadingState.retryLoading;
        }
        boolean z12 = z11;
        boolean z13 = z10;
        return genFMLoadingState.copy(str, z6, z13, str2, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getNavigateToPlayer() {
        return this.navigateToPlayer;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getNavigateBack() {
        return this.navigateBack;
    }

    /* renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getRetryLoading() {
        return this.retryLoading;
    }

    public final GenFMLoadingState copy(String readId, boolean navigateToPlayer, boolean navigateBack, String error, boolean retryLoading) {
        error.getClass();
        return new GenFMLoadingState(readId, navigateToPlayer, navigateBack, error, retryLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenFMLoadingState)) {
            return false;
        }
        GenFMLoadingState genFMLoadingState = (GenFMLoadingState) other;
        if (kotlin.jvm.internal.m.c(this.readId, genFMLoadingState.readId) && this.navigateToPlayer == genFMLoadingState.navigateToPlayer && this.navigateBack == genFMLoadingState.navigateBack && kotlin.jvm.internal.m.c(this.error, genFMLoadingState.error) && this.retryLoading == genFMLoadingState.retryLoading) {
            return true;
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final boolean getNavigateBack() {
        return this.navigateBack;
    }

    public final boolean getNavigateToPlayer() {
        return this.navigateToPlayer;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final boolean getRetryLoading() {
        return this.retryLoading;
    }

    public int hashCode() {
        int hashCode;
        String str = this.readId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.retryLoading) + j0.c.c(com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(hashCode * 31, 31, this.navigateToPlayer), 31, this.navigateBack), 31, this.error);
    }

    public String toString() {
        String str = this.readId;
        boolean z6 = this.navigateToPlayer;
        boolean z10 = this.navigateBack;
        String str2 = this.error;
        boolean z11 = this.retryLoading;
        StringBuilder sb = new StringBuilder("GenFMLoadingState(readId=");
        sb.append(str);
        sb.append(", navigateToPlayer=");
        sb.append(z6);
        sb.append(", navigateBack=");
        defpackage.f.z(sb, z10, ", error=", str2, ", retryLoading=");
        return p.n.j(Separators.RPAREN, sb, z11);
    }

    public GenFMLoadingState(String str, boolean z6, boolean z10, String str2, boolean z11) {
        str2.getClass();
        this.readId = str;
        this.navigateToPlayer = z6;
        this.navigateBack = z10;
        this.error = str2;
        this.retryLoading = z11;
    }

    public GenFMLoadingState() {
        this(null, false, false, null, false, 31, null);
    }
}

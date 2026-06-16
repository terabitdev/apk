package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.elevenlabs.domain.model.CollectionMeta;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/EditCollectionState;", "", "collectionId", "", ParameterNames.ICON, "Lio/elevenlabs/domain/model/CollectionMeta$Icon;", DiagnosticsEntry.NAME_KEY, "isLoading", "", "goBack", "<init>", "(Ljava/lang/String;Lio/elevenlabs/domain/model/CollectionMeta$Icon;Ljava/lang/String;ZZ)V", "getCollectionId", "()Ljava/lang/String;", "getIcon", "()Lio/elevenlabs/domain/model/CollectionMeta$Icon;", "getName", "()Z", "getGoBack", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class EditCollectionState {
    public static final int $stable = 0;
    private final String collectionId;
    private final boolean goBack;
    private final CollectionMeta.Icon icon;
    private final boolean isLoading;
    private final String name;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ EditCollectionState(java.lang.String r2, io.elevenlabs.domain.model.CollectionMeta.Icon r3, java.lang.String r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.f r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r2 = 0
        L5:
            r8 = r7 & 2
            if (r8 == 0) goto L13
            zn.a r3 = io.elevenlabs.domain.model.CollectionMeta.Icon.getEntries()
            java.lang.Object r3 = tn.o.w0(r3)
            io.elevenlabs.domain.model.CollectionMeta$Icon r3 = (io.elevenlabs.domain.model.CollectionMeta.Icon) r3
        L13:
            r8 = r7 & 4
            if (r8 == 0) goto L19
            java.lang.String r4 = ""
        L19:
            r8 = r7 & 8
            r0 = 0
            if (r8 == 0) goto L1f
            r5 = r0
        L1f:
            r7 = r7 & 16
            if (r7 == 0) goto L2a
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L30
        L2a:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L30:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.readerapp.ui.screens.authenticated.collections.EditCollectionState.<init>(java.lang.String, io.elevenlabs.domain.model.CollectionMeta$Icon, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.f):void");
    }

    public static /* synthetic */ EditCollectionState copy$default(EditCollectionState editCollectionState, String str, CollectionMeta.Icon icon, String str2, boolean z6, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = editCollectionState.collectionId;
        }
        if ((i10 & 2) != 0) {
            icon = editCollectionState.icon;
        }
        if ((i10 & 4) != 0) {
            str2 = editCollectionState.name;
        }
        if ((i10 & 8) != 0) {
            z6 = editCollectionState.isLoading;
        }
        if ((i10 & 16) != 0) {
            z10 = editCollectionState.goBack;
        }
        boolean z11 = z10;
        String str3 = str2;
        return editCollectionState.copy(str, icon, str3, z6, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCollectionId() {
        return this.collectionId;
    }

    /* renamed from: component2, reason: from getter */
    public final CollectionMeta.Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getGoBack() {
        return this.goBack;
    }

    public final EditCollectionState copy(String collectionId, CollectionMeta.Icon icon, String name, boolean isLoading, boolean goBack) {
        icon.getClass();
        name.getClass();
        return new EditCollectionState(collectionId, icon, name, isLoading, goBack);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditCollectionState)) {
            return false;
        }
        EditCollectionState editCollectionState = (EditCollectionState) other;
        if (kotlin.jvm.internal.m.c(this.collectionId, editCollectionState.collectionId) && this.icon == editCollectionState.icon && kotlin.jvm.internal.m.c(this.name, editCollectionState.name) && this.isLoading == editCollectionState.isLoading && this.goBack == editCollectionState.goBack) {
            return true;
        }
        return false;
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final boolean getGoBack() {
        return this.goBack;
    }

    public final CollectionMeta.Icon getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode;
        String str = this.collectionId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.goBack) + com.google.android.gms.internal.play_billing.b.f(j0.c.c((this.icon.hashCode() + (hashCode * 31)) * 31, 31, this.name), 31, this.isLoading);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        String str = this.collectionId;
        CollectionMeta.Icon icon = this.icon;
        String str2 = this.name;
        boolean z6 = this.isLoading;
        boolean z10 = this.goBack;
        StringBuilder sb = new StringBuilder("EditCollectionState(collectionId=");
        sb.append(str);
        sb.append(", icon=");
        sb.append(icon);
        sb.append(", name=");
        defpackage.f.y(sb, str2, ", isLoading=", z6, ", goBack=");
        return p.n.j(Separators.RPAREN, sb, z10);
    }

    public EditCollectionState(String str, CollectionMeta.Icon icon, String str2, boolean z6, boolean z10) {
        icon.getClass();
        str2.getClass();
        this.collectionId = str;
        this.icon = icon;
        this.name = str2;
        this.isLoading = z6;
        this.goBack = z10;
    }

    public EditCollectionState() {
        this(null, null, null, false, false, 31, null);
    }
}

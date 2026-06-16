package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.elevenlabs.domain.model.CollectionMeta;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/CreateCollectionState;", "", DiagnosticsEntry.NAME_KEY, "", ParameterNames.ICON, "Lio/elevenlabs/domain/model/CollectionMeta$Icon;", "isLoading", "", "createdCollectionId", "<init>", "(Ljava/lang/String;Lio/elevenlabs/domain/model/CollectionMeta$Icon;ZLjava/lang/String;)V", "getName", "()Ljava/lang/String;", "getIcon", "()Lio/elevenlabs/domain/model/CollectionMeta$Icon;", "()Z", "getCreatedCollectionId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class CreateCollectionState {
    public static final int $stable = 0;
    private final String createdCollectionId;
    private final CollectionMeta.Icon icon;
    private final boolean isLoading;
    private final String name;

    public /* synthetic */ CreateCollectionState(String str, CollectionMeta.Icon icon, boolean z6, String str2, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? (CollectionMeta.Icon) tn.o.w0(CollectionMeta.Icon.getEntries()) : icon, (i10 & 4) != 0 ? false : z6, (i10 & 8) != 0 ? null : str2);
    }

    public static /* synthetic */ CreateCollectionState copy$default(CreateCollectionState createCollectionState, String str, CollectionMeta.Icon icon, boolean z6, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = createCollectionState.name;
        }
        if ((i10 & 2) != 0) {
            icon = createCollectionState.icon;
        }
        if ((i10 & 4) != 0) {
            z6 = createCollectionState.isLoading;
        }
        if ((i10 & 8) != 0) {
            str2 = createCollectionState.createdCollectionId;
        }
        return createCollectionState.copy(str, icon, z6, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final CollectionMeta.Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCreatedCollectionId() {
        return this.createdCollectionId;
    }

    public final CreateCollectionState copy(String name, CollectionMeta.Icon icon, boolean isLoading, String createdCollectionId) {
        name.getClass();
        icon.getClass();
        return new CreateCollectionState(name, icon, isLoading, createdCollectionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateCollectionState)) {
            return false;
        }
        CreateCollectionState createCollectionState = (CreateCollectionState) other;
        if (kotlin.jvm.internal.m.c(this.name, createCollectionState.name) && this.icon == createCollectionState.icon && this.isLoading == createCollectionState.isLoading && kotlin.jvm.internal.m.c(this.createdCollectionId, createCollectionState.createdCollectionId)) {
            return true;
        }
        return false;
    }

    public final String getCreatedCollectionId() {
        return this.createdCollectionId;
    }

    public final CollectionMeta.Icon getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode;
        int f10 = com.google.android.gms.internal.play_billing.b.f((this.icon.hashCode() + (this.name.hashCode() * 31)) * 31, 31, this.isLoading);
        String str = this.createdCollectionId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return f10 + hashCode;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "CreateCollectionState(name=" + this.name + ", icon=" + this.icon + ", isLoading=" + this.isLoading + ", createdCollectionId=" + this.createdCollectionId + Separators.RPAREN;
    }

    public CreateCollectionState(String str, CollectionMeta.Icon icon, boolean z6, String str2) {
        str.getClass();
        icon.getClass();
        this.name = str;
        this.icon = icon;
        this.isLoading = z6;
        this.createdCollectionId = str2;
    }

    public CreateCollectionState() {
        this(null, null, false, null, 15, null);
    }
}

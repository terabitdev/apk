package io.elevenlabs.readerapp.ui.screens.authenticated;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.ExploreCollectionDetails;
import io.elevenlabs.domain.model.MoneyPrice;
import io.elevenlabs.readerapp.ui.models.UiAction;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\f\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u001a\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u001e\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0082\u0001\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0012\b\u0002\u0010\f\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0015J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b\u0007\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b0\u0010\u0015R!\u0010\f\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b\r\u0010\u001eR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b4\u0010\u0015R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b6\u0010!¨\u00067"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/ExploreCollectionState;", "", "", "collectionId", "Lio/elevenlabs/domain/model/ExploreCollectionDetails;", "collectionDetails", "", "isLoadingDetails", "errorMessage", "Lio/elevenlabs/readerapp/ui/models/UiAction;", "Lsn/z;", "Lio/elevenlabs/readerapp/ui/models/SimpleUiAction;", "triggerNavigateBack", "isFreeUser", "playingPreviewReadId", "", "Lio/elevenlabs/domain/model/MoneyPrice;", "localizedPrices", "<init>", "(Ljava/lang/String;Lio/elevenlabs/domain/model/ExploreCollectionDetails;ZLjava/lang/String;Lio/elevenlabs/readerapp/ui/models/UiAction;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Lio/elevenlabs/domain/model/ExploreCollectionDetails;", "component3", "()Z", "component4", "component5", "()Lio/elevenlabs/readerapp/ui/models/UiAction;", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Lio/elevenlabs/domain/model/ExploreCollectionDetails;ZLjava/lang/String;Lio/elevenlabs/readerapp/ui/models/UiAction;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;)Lio/elevenlabs/readerapp/ui/screens/authenticated/ExploreCollectionState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCollectionId", "Lio/elevenlabs/domain/model/ExploreCollectionDetails;", "getCollectionDetails", "Z", "getErrorMessage", "Lio/elevenlabs/readerapp/ui/models/UiAction;", "getTriggerNavigateBack", "Ljava/lang/Boolean;", "getPlayingPreviewReadId", "Ljava/util/Map;", "getLocalizedPrices", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ExploreCollectionState {
    public static final int $stable = 8;
    private final ExploreCollectionDetails collectionDetails;
    private final String collectionId;
    private final String errorMessage;
    private final Boolean isFreeUser;
    private final boolean isLoadingDetails;
    private final Map<String, MoneyPrice> localizedPrices;
    private final String playingPreviewReadId;
    private final UiAction<sn.z> triggerNavigateBack;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ExploreCollectionState(String str, ExploreCollectionDetails exploreCollectionDetails, boolean z6, String str2, UiAction uiAction, Boolean bool, String str3, Map map, int i10, kotlin.jvm.internal.f fVar) {
        this(str, exploreCollectionDetails, z6, str2, uiAction, bool, str3, r10);
        Map map2;
        str = (i10 & 1) != 0 ? null : str;
        exploreCollectionDetails = (i10 & 2) != 0 ? null : exploreCollectionDetails;
        z6 = (i10 & 4) != 0 ? false : z6;
        str2 = (i10 & 8) != 0 ? null : str2;
        uiAction = (i10 & 16) != 0 ? UiAction.Reset.INSTANCE : uiAction;
        bool = (i10 & 32) != 0 ? null : bool;
        str3 = (i10 & 64) != 0 ? null : str3;
        if ((i10 & 128) != 0) {
            map2 = null;
        } else {
            map2 = map;
        }
    }

    public static /* synthetic */ ExploreCollectionState copy$default(ExploreCollectionState exploreCollectionState, String str, ExploreCollectionDetails exploreCollectionDetails, boolean z6, String str2, UiAction uiAction, Boolean bool, String str3, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = exploreCollectionState.collectionId;
        }
        if ((i10 & 2) != 0) {
            exploreCollectionDetails = exploreCollectionState.collectionDetails;
        }
        if ((i10 & 4) != 0) {
            z6 = exploreCollectionState.isLoadingDetails;
        }
        if ((i10 & 8) != 0) {
            str2 = exploreCollectionState.errorMessage;
        }
        if ((i10 & 16) != 0) {
            uiAction = exploreCollectionState.triggerNavigateBack;
        }
        if ((i10 & 32) != 0) {
            bool = exploreCollectionState.isFreeUser;
        }
        if ((i10 & 64) != 0) {
            str3 = exploreCollectionState.playingPreviewReadId;
        }
        if ((i10 & 128) != 0) {
            map = exploreCollectionState.localizedPrices;
        }
        String str4 = str3;
        Map map2 = map;
        UiAction uiAction2 = uiAction;
        Boolean bool2 = bool;
        return exploreCollectionState.copy(str, exploreCollectionDetails, z6, str2, uiAction2, bool2, str4, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCollectionId() {
        return this.collectionId;
    }

    /* renamed from: component2, reason: from getter */
    public final ExploreCollectionDetails getCollectionDetails() {
        return this.collectionDetails;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoadingDetails() {
        return this.isLoadingDetails;
    }

    /* renamed from: component4, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final UiAction<sn.z> component5() {
        return this.triggerNavigateBack;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsFreeUser() {
        return this.isFreeUser;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPlayingPreviewReadId() {
        return this.playingPreviewReadId;
    }

    public final Map<String, MoneyPrice> component8() {
        return this.localizedPrices;
    }

    public final ExploreCollectionState copy(String collectionId, ExploreCollectionDetails collectionDetails, boolean isLoadingDetails, String errorMessage, UiAction<sn.z> triggerNavigateBack, Boolean isFreeUser, String playingPreviewReadId, Map<String, MoneyPrice> localizedPrices) {
        triggerNavigateBack.getClass();
        return new ExploreCollectionState(collectionId, collectionDetails, isLoadingDetails, errorMessage, triggerNavigateBack, isFreeUser, playingPreviewReadId, localizedPrices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExploreCollectionState)) {
            return false;
        }
        ExploreCollectionState exploreCollectionState = (ExploreCollectionState) other;
        if (kotlin.jvm.internal.m.c(this.collectionId, exploreCollectionState.collectionId) && kotlin.jvm.internal.m.c(this.collectionDetails, exploreCollectionState.collectionDetails) && this.isLoadingDetails == exploreCollectionState.isLoadingDetails && kotlin.jvm.internal.m.c(this.errorMessage, exploreCollectionState.errorMessage) && kotlin.jvm.internal.m.c(this.triggerNavigateBack, exploreCollectionState.triggerNavigateBack) && kotlin.jvm.internal.m.c(this.isFreeUser, exploreCollectionState.isFreeUser) && kotlin.jvm.internal.m.c(this.playingPreviewReadId, exploreCollectionState.playingPreviewReadId) && kotlin.jvm.internal.m.c(this.localizedPrices, exploreCollectionState.localizedPrices)) {
            return true;
        }
        return false;
    }

    public final ExploreCollectionDetails getCollectionDetails() {
        return this.collectionDetails;
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final Map<String, MoneyPrice> getLocalizedPrices() {
        return this.localizedPrices;
    }

    public final String getPlayingPreviewReadId() {
        return this.playingPreviewReadId;
    }

    public final UiAction<sn.z> getTriggerNavigateBack() {
        return this.triggerNavigateBack;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.collectionId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        ExploreCollectionDetails exploreCollectionDetails = this.collectionDetails;
        if (exploreCollectionDetails == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = exploreCollectionDetails.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f((i11 + hashCode2) * 31, 31, this.isLoadingDetails);
        String str2 = this.errorMessage;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int hashCode6 = (this.triggerNavigateBack.hashCode() + ((f10 + hashCode3) * 31)) * 31;
        Boolean bool = this.isFreeUser;
        if (bool == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool.hashCode();
        }
        int i12 = (hashCode6 + hashCode4) * 31;
        String str3 = this.playingPreviewReadId;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        Map<String, MoneyPrice> map = this.localizedPrices;
        if (map != null) {
            i10 = map.hashCode();
        }
        return i13 + i10;
    }

    public final Boolean isFreeUser() {
        return this.isFreeUser;
    }

    public final boolean isLoadingDetails() {
        return this.isLoadingDetails;
    }

    public String toString() {
        String str = this.collectionId;
        ExploreCollectionDetails exploreCollectionDetails = this.collectionDetails;
        boolean z6 = this.isLoadingDetails;
        String str2 = this.errorMessage;
        UiAction<sn.z> uiAction = this.triggerNavigateBack;
        Boolean bool = this.isFreeUser;
        String str3 = this.playingPreviewReadId;
        Map<String, MoneyPrice> map = this.localizedPrices;
        StringBuilder sb = new StringBuilder("ExploreCollectionState(collectionId=");
        sb.append(str);
        sb.append(", collectionDetails=");
        sb.append(exploreCollectionDetails);
        sb.append(", isLoadingDetails=");
        defpackage.f.z(sb, z6, ", errorMessage=", str2, ", triggerNavigateBack=");
        sb.append(uiAction);
        sb.append(", isFreeUser=");
        sb.append(bool);
        sb.append(", playingPreviewReadId=");
        sb.append(str3);
        sb.append(", localizedPrices=");
        sb.append(map);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public ExploreCollectionState(String str, ExploreCollectionDetails exploreCollectionDetails, boolean z6, String str2, UiAction<sn.z> uiAction, Boolean bool, String str3, Map<String, MoneyPrice> map) {
        uiAction.getClass();
        this.collectionId = str;
        this.collectionDetails = exploreCollectionDetails;
        this.isLoadingDetails = z6;
        this.errorMessage = str2;
        this.triggerNavigateBack = uiAction;
        this.isFreeUser = bool;
        this.playingPreviewReadId = str3;
        this.localizedPrices = map;
    }

    public ExploreCollectionState() {
        this(null, null, false, null, null, null, null, null, 255, null);
    }
}

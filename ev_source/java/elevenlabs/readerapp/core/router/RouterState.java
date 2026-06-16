package io.elevenlabs.readerapp.core.router;

import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.Destination;
import io.elevenlabs.domain.model.Message;
import io.elevenlabs.readerapp.core.router.ClearPlayerQueueConfirmation;
import io.elevenlabs.readerapp.ui.models.UiAction;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0018\b\u0002\u0010\u0016\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\t0\u0018j\u0002`\u00190\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\rHÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010I\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0019\u0010J\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\t0\u0018j\u0002`\u00190\u0017HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010L\u001a\u0004\u0018\u00010\u001dHÆ\u0003Jä\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0018\b\u0002\u0010\u0016\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\t0\u0018j\u0002`\u00190\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0002\u0010NJ\u0014\u0010O\u001a\u00020\u00032\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010Q\u001a\u00020RHÖ\u0081\u0004J\n\u0010S\u001a\u00020\tHÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b#\u0010!R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b$\u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010*R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010*R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b\u0013\u0010!R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R!\u0010\u0016\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\t0\u0018j\u0002`\u00190\u0017¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:¨\u0006T"}, d2 = {"Lio/elevenlabs/readerapp/core/router/RouterState;", "", "signedIn", "", "onboardingCompleted", "ageOnboardingCompleted", "pendingShare", "Lio/elevenlabs/readerapp/core/router/PendingShare;", "pendingDeepLink", "", "showLoading", "showImportSheet", "clearPlayerQueueConfirmation", "Lio/elevenlabs/readerapp/core/router/ClearPlayerQueueConfirmation;", "hasRedeemDeepLink", "shouldShowPaywall", "isReturningPaywall", "winBackAvailable", "canUpgrade", "isFreeUser", "pendingNavigation", "Lio/elevenlabs/domain/model/Destination;", "startSelectiveStackPopping", "Lio/elevenlabs/readerapp/ui/models/UiAction;", "", "Lio/elevenlabs/readerapp/core/router/StackPoppingRoutes;", "lastMessageCheckTimestamp", "", "messageToDisplay", "Lio/elevenlabs/domain/model/Message;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/elevenlabs/readerapp/core/router/PendingShare;Ljava/lang/String;ZZLio/elevenlabs/readerapp/core/router/ClearPlayerQueueConfirmation;ZZZZZLjava/lang/Boolean;Lio/elevenlabs/domain/model/Destination;Lio/elevenlabs/readerapp/ui/models/UiAction;Ljava/lang/Long;Lio/elevenlabs/domain/model/Message;)V", "getSignedIn", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOnboardingCompleted", "getAgeOnboardingCompleted", "getPendingShare", "()Lio/elevenlabs/readerapp/core/router/PendingShare;", "getPendingDeepLink", "()Ljava/lang/String;", "getShowLoading", "()Z", "getShowImportSheet", "getClearPlayerQueueConfirmation", "()Lio/elevenlabs/readerapp/core/router/ClearPlayerQueueConfirmation;", "getHasRedeemDeepLink", "getShouldShowPaywall", "getWinBackAvailable", "getCanUpgrade", "getPendingNavigation", "()Lio/elevenlabs/domain/model/Destination;", "getStartSelectiveStackPopping", "()Lio/elevenlabs/readerapp/ui/models/UiAction;", "getLastMessageCheckTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMessageToDisplay", "()Lio/elevenlabs/domain/model/Message;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/elevenlabs/readerapp/core/router/PendingShare;Ljava/lang/String;ZZLio/elevenlabs/readerapp/core/router/ClearPlayerQueueConfirmation;ZZZZZLjava/lang/Boolean;Lio/elevenlabs/domain/model/Destination;Lio/elevenlabs/readerapp/ui/models/UiAction;Ljava/lang/Long;Lio/elevenlabs/domain/model/Message;)Lio/elevenlabs/readerapp/core/router/RouterState;", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class RouterState {
    public static final int $stable = 8;
    private final Boolean ageOnboardingCompleted;
    private final boolean canUpgrade;
    private final ClearPlayerQueueConfirmation clearPlayerQueueConfirmation;
    private final boolean hasRedeemDeepLink;
    private final Boolean isFreeUser;
    private final boolean isReturningPaywall;
    private final Long lastMessageCheckTimestamp;
    private final Message messageToDisplay;
    private final Boolean onboardingCompleted;
    private final String pendingDeepLink;
    private final Destination pendingNavigation;
    private final PendingShare pendingShare;
    private final boolean shouldShowPaywall;
    private final boolean showImportSheet;
    private final boolean showLoading;
    private final Boolean signedIn;
    private final UiAction<List<String>> startSelectiveStackPopping;
    private final boolean winBackAvailable;

    public /* synthetic */ RouterState(Boolean bool, Boolean bool2, Boolean bool3, PendingShare pendingShare, String str, boolean z6, boolean z10, ClearPlayerQueueConfirmation clearPlayerQueueConfirmation, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Boolean bool4, Destination destination, UiAction uiAction, Long l4, Message message, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2, (i10 & 4) != 0 ? null : bool3, (i10 & 8) != 0 ? null : pendingShare, (i10 & 16) != 0 ? null : str, (i10 & 32) != 0 ? false : z6, (i10 & 64) != 0 ? false : z10, (i10 & 128) != 0 ? ClearPlayerQueueConfirmation.Hidden.INSTANCE : clearPlayerQueueConfirmation, (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? false : z11, (i10 & 512) != 0 ? false : z12, (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? false : z13, (i10 & 2048) != 0 ? false : z14, (i10 & 4096) == 0 ? z15 : false, (i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : bool4, (i10 & 16384) != 0 ? null : destination, (i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? UiAction.Reset.INSTANCE : uiAction, (i10 & 65536) != 0 ? null : l4, (i10 & 131072) != 0 ? null : message);
    }

    public static /* synthetic */ RouterState copy$default(RouterState routerState, Boolean bool, Boolean bool2, Boolean bool3, PendingShare pendingShare, String str, boolean z6, boolean z10, ClearPlayerQueueConfirmation clearPlayerQueueConfirmation, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Boolean bool4, Destination destination, UiAction uiAction, Long l4, Message message, int i10, Object obj) {
        Message message2;
        Long l7;
        Boolean bool5 = (i10 & 1) != 0 ? routerState.signedIn : bool;
        Boolean bool6 = (i10 & 2) != 0 ? routerState.onboardingCompleted : bool2;
        Boolean bool7 = (i10 & 4) != 0 ? routerState.ageOnboardingCompleted : bool3;
        PendingShare pendingShare2 = (i10 & 8) != 0 ? routerState.pendingShare : pendingShare;
        String str2 = (i10 & 16) != 0 ? routerState.pendingDeepLink : str;
        boolean z16 = (i10 & 32) != 0 ? routerState.showLoading : z6;
        boolean z17 = (i10 & 64) != 0 ? routerState.showImportSheet : z10;
        ClearPlayerQueueConfirmation clearPlayerQueueConfirmation2 = (i10 & 128) != 0 ? routerState.clearPlayerQueueConfirmation : clearPlayerQueueConfirmation;
        boolean z18 = (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? routerState.hasRedeemDeepLink : z11;
        boolean z19 = (i10 & 512) != 0 ? routerState.shouldShowPaywall : z12;
        boolean z20 = (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? routerState.isReturningPaywall : z13;
        boolean z21 = (i10 & 2048) != 0 ? routerState.winBackAvailable : z14;
        boolean z22 = (i10 & 4096) != 0 ? routerState.canUpgrade : z15;
        Boolean bool8 = (i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? routerState.isFreeUser : bool4;
        Boolean bool9 = bool5;
        Destination destination2 = (i10 & 16384) != 0 ? routerState.pendingNavigation : destination;
        UiAction uiAction2 = (i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? routerState.startSelectiveStackPopping : uiAction;
        Long l10 = (i10 & 65536) != 0 ? routerState.lastMessageCheckTimestamp : l4;
        if ((i10 & 131072) != 0) {
            l7 = l10;
            message2 = routerState.messageToDisplay;
        } else {
            message2 = message;
            l7 = l10;
        }
        return routerState.copy(bool9, bool6, bool7, pendingShare2, str2, z16, z17, clearPlayerQueueConfirmation2, z18, z19, z20, z21, z22, bool8, destination2, uiAction2, l7, message2);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getSignedIn() {
        return this.signedIn;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShouldShowPaywall() {
        return this.shouldShowPaywall;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsReturningPaywall() {
        return this.isReturningPaywall;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getWinBackAvailable() {
        return this.winBackAvailable;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getCanUpgrade() {
        return this.canUpgrade;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getIsFreeUser() {
        return this.isFreeUser;
    }

    /* renamed from: component15, reason: from getter */
    public final Destination getPendingNavigation() {
        return this.pendingNavigation;
    }

    public final UiAction<List<String>> component16() {
        return this.startSelectiveStackPopping;
    }

    /* renamed from: component17, reason: from getter */
    public final Long getLastMessageCheckTimestamp() {
        return this.lastMessageCheckTimestamp;
    }

    /* renamed from: component18, reason: from getter */
    public final Message getMessageToDisplay() {
        return this.messageToDisplay;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getOnboardingCompleted() {
        return this.onboardingCompleted;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getAgeOnboardingCompleted() {
        return this.ageOnboardingCompleted;
    }

    /* renamed from: component4, reason: from getter */
    public final PendingShare getPendingShare() {
        return this.pendingShare;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPendingDeepLink() {
        return this.pendingDeepLink;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowLoading() {
        return this.showLoading;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowImportSheet() {
        return this.showImportSheet;
    }

    /* renamed from: component8, reason: from getter */
    public final ClearPlayerQueueConfirmation getClearPlayerQueueConfirmation() {
        return this.clearPlayerQueueConfirmation;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHasRedeemDeepLink() {
        return this.hasRedeemDeepLink;
    }

    public final RouterState copy(Boolean signedIn, Boolean onboardingCompleted, Boolean ageOnboardingCompleted, PendingShare pendingShare, String pendingDeepLink, boolean showLoading, boolean showImportSheet, ClearPlayerQueueConfirmation clearPlayerQueueConfirmation, boolean hasRedeemDeepLink, boolean shouldShowPaywall, boolean isReturningPaywall, boolean winBackAvailable, boolean canUpgrade, Boolean isFreeUser, Destination pendingNavigation, UiAction<? extends List<String>> startSelectiveStackPopping, Long lastMessageCheckTimestamp, Message messageToDisplay) {
        clearPlayerQueueConfirmation.getClass();
        startSelectiveStackPopping.getClass();
        return new RouterState(signedIn, onboardingCompleted, ageOnboardingCompleted, pendingShare, pendingDeepLink, showLoading, showImportSheet, clearPlayerQueueConfirmation, hasRedeemDeepLink, shouldShowPaywall, isReturningPaywall, winBackAvailable, canUpgrade, isFreeUser, pendingNavigation, startSelectiveStackPopping, lastMessageCheckTimestamp, messageToDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouterState)) {
            return false;
        }
        RouterState routerState = (RouterState) other;
        if (kotlin.jvm.internal.m.c(this.signedIn, routerState.signedIn) && kotlin.jvm.internal.m.c(this.onboardingCompleted, routerState.onboardingCompleted) && kotlin.jvm.internal.m.c(this.ageOnboardingCompleted, routerState.ageOnboardingCompleted) && kotlin.jvm.internal.m.c(this.pendingShare, routerState.pendingShare) && kotlin.jvm.internal.m.c(this.pendingDeepLink, routerState.pendingDeepLink) && this.showLoading == routerState.showLoading && this.showImportSheet == routerState.showImportSheet && kotlin.jvm.internal.m.c(this.clearPlayerQueueConfirmation, routerState.clearPlayerQueueConfirmation) && this.hasRedeemDeepLink == routerState.hasRedeemDeepLink && this.shouldShowPaywall == routerState.shouldShowPaywall && this.isReturningPaywall == routerState.isReturningPaywall && this.winBackAvailable == routerState.winBackAvailable && this.canUpgrade == routerState.canUpgrade && kotlin.jvm.internal.m.c(this.isFreeUser, routerState.isFreeUser) && kotlin.jvm.internal.m.c(this.pendingNavigation, routerState.pendingNavigation) && kotlin.jvm.internal.m.c(this.startSelectiveStackPopping, routerState.startSelectiveStackPopping) && kotlin.jvm.internal.m.c(this.lastMessageCheckTimestamp, routerState.lastMessageCheckTimestamp) && kotlin.jvm.internal.m.c(this.messageToDisplay, routerState.messageToDisplay)) {
            return true;
        }
        return false;
    }

    public final Boolean getAgeOnboardingCompleted() {
        return this.ageOnboardingCompleted;
    }

    public final boolean getCanUpgrade() {
        return this.canUpgrade;
    }

    public final ClearPlayerQueueConfirmation getClearPlayerQueueConfirmation() {
        return this.clearPlayerQueueConfirmation;
    }

    public final boolean getHasRedeemDeepLink() {
        return this.hasRedeemDeepLink;
    }

    public final Long getLastMessageCheckTimestamp() {
        return this.lastMessageCheckTimestamp;
    }

    public final Message getMessageToDisplay() {
        return this.messageToDisplay;
    }

    public final Boolean getOnboardingCompleted() {
        return this.onboardingCompleted;
    }

    public final String getPendingDeepLink() {
        return this.pendingDeepLink;
    }

    public final Destination getPendingNavigation() {
        return this.pendingNavigation;
    }

    public final PendingShare getPendingShare() {
        return this.pendingShare;
    }

    public final boolean getShouldShowPaywall() {
        return this.shouldShowPaywall;
    }

    public final boolean getShowImportSheet() {
        return this.showImportSheet;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final Boolean getSignedIn() {
        return this.signedIn;
    }

    public final UiAction<List<String>> getStartSelectiveStackPopping() {
        return this.startSelectiveStackPopping;
    }

    public final boolean getWinBackAvailable() {
        return this.winBackAvailable;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        Boolean bool = this.signedIn;
        int i10 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i11 = hashCode * 31;
        Boolean bool2 = this.onboardingCompleted;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Boolean bool3 = this.ageOnboardingCompleted;
        if (bool3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        PendingShare pendingShare = this.pendingShare;
        if (pendingShare == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = pendingShare.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str = this.pendingDeepLink;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((this.clearPlayerQueueConfirmation.hashCode() + com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((i14 + hashCode5) * 31, 31, this.showLoading), 31, this.showImportSheet)) * 31, 31, this.hasRedeemDeepLink), 31, this.shouldShowPaywall), 31, this.isReturningPaywall), 31, this.winBackAvailable), 31, this.canUpgrade);
        Boolean bool4 = this.isFreeUser;
        if (bool4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = bool4.hashCode();
        }
        int i15 = (f10 + hashCode6) * 31;
        Destination destination = this.pendingNavigation;
        if (destination == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = destination.hashCode();
        }
        int hashCode9 = (this.startSelectiveStackPopping.hashCode() + ((i15 + hashCode7) * 31)) * 31;
        Long l4 = this.lastMessageCheckTimestamp;
        if (l4 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = l4.hashCode();
        }
        int i16 = (hashCode9 + hashCode8) * 31;
        Message message = this.messageToDisplay;
        if (message != null) {
            i10 = message.hashCode();
        }
        return i16 + i10;
    }

    public final Boolean isFreeUser() {
        return this.isFreeUser;
    }

    public final boolean isReturningPaywall() {
        return this.isReturningPaywall;
    }

    public String toString() {
        Boolean bool = this.signedIn;
        Boolean bool2 = this.onboardingCompleted;
        Boolean bool3 = this.ageOnboardingCompleted;
        PendingShare pendingShare = this.pendingShare;
        String str = this.pendingDeepLink;
        boolean z6 = this.showLoading;
        boolean z10 = this.showImportSheet;
        ClearPlayerQueueConfirmation clearPlayerQueueConfirmation = this.clearPlayerQueueConfirmation;
        boolean z11 = this.hasRedeemDeepLink;
        boolean z12 = this.shouldShowPaywall;
        boolean z13 = this.isReturningPaywall;
        boolean z14 = this.winBackAvailable;
        boolean z15 = this.canUpgrade;
        Boolean bool4 = this.isFreeUser;
        Destination destination = this.pendingNavigation;
        UiAction<List<String>> uiAction = this.startSelectiveStackPopping;
        Long l4 = this.lastMessageCheckTimestamp;
        Message message = this.messageToDisplay;
        StringBuilder sb = new StringBuilder("RouterState(signedIn=");
        sb.append(bool);
        sb.append(", onboardingCompleted=");
        sb.append(bool2);
        sb.append(", ageOnboardingCompleted=");
        sb.append(bool3);
        sb.append(", pendingShare=");
        sb.append(pendingShare);
        sb.append(", pendingDeepLink=");
        defpackage.f.y(sb, str, ", showLoading=", z6, ", showImportSheet=");
        sb.append(z10);
        sb.append(", clearPlayerQueueConfirmation=");
        sb.append(clearPlayerQueueConfirmation);
        sb.append(", hasRedeemDeepLink=");
        ib.i.t(sb, z11, ", shouldShowPaywall=", z12, ", isReturningPaywall=");
        ib.i.t(sb, z13, ", winBackAvailable=", z14, ", canUpgrade=");
        sb.append(z15);
        sb.append(", isFreeUser=");
        sb.append(bool4);
        sb.append(", pendingNavigation=");
        sb.append(destination);
        sb.append(", startSelectiveStackPopping=");
        sb.append(uiAction);
        sb.append(", lastMessageCheckTimestamp=");
        sb.append(l4);
        sb.append(", messageToDisplay=");
        sb.append(message);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RouterState(Boolean bool, Boolean bool2, Boolean bool3, PendingShare pendingShare, String str, boolean z6, boolean z10, ClearPlayerQueueConfirmation clearPlayerQueueConfirmation, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Boolean bool4, Destination destination, UiAction<? extends List<String>> uiAction, Long l4, Message message) {
        clearPlayerQueueConfirmation.getClass();
        uiAction.getClass();
        this.signedIn = bool;
        this.onboardingCompleted = bool2;
        this.ageOnboardingCompleted = bool3;
        this.pendingShare = pendingShare;
        this.pendingDeepLink = str;
        this.showLoading = z6;
        this.showImportSheet = z10;
        this.clearPlayerQueueConfirmation = clearPlayerQueueConfirmation;
        this.hasRedeemDeepLink = z11;
        this.shouldShowPaywall = z12;
        this.isReturningPaywall = z13;
        this.winBackAvailable = z14;
        this.canUpgrade = z15;
        this.isFreeUser = bool4;
        this.pendingNavigation = destination;
        this.startSelectiveStackPopping = uiAction;
        this.lastMessageCheckTimestamp = l4;
        this.messageToDisplay = message;
    }

    public RouterState() {
        this(null, null, null, null, null, false, false, null, false, false, false, false, false, null, null, null, null, null, 262143, null);
    }
}

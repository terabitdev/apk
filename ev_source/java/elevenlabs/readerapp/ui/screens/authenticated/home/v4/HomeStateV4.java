package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4;

import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.MoneyPrice;
import io.elevenlabs.domain.model.NotificationPrimerModel;
import io.elevenlabs.domain.model.NotificationPrimerSource;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.User;
import io.elevenlabs.domain.model.home.HomePageV4;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0003J\t\u0010>\u001a\u00020\u000fHÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010A\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0017\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u001dHÆ\u0003JÔ\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0002\u0010IJ\u0014\u0010J\u001a\u00020\u00032\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010L\u001a\u00020MHÖ\u0081\u0004J\n\u0010N\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010 R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010 R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010,\u001a\u0004\b\u0011\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001f\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006O"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v4/HomeStateV4;", "", "isScreenVisible", "", "isLoading", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "page", "Lio/elevenlabs/domain/model/home/HomePageV4;", "recentReads", "", "Lio/elevenlabs/domain/model/ReadMeta;", "playerQueue", "Lio/elevenlabs/domain/model/MediaItemState;", "targetStreakGoalMinutes", "", "showDailyStreakSettings", "isFreeUser", "user", "Lio/elevenlabs/domain/model/User;", "localizedPrices", "", "Lio/elevenlabs/domain/model/MoneyPrice;", "playingPreviewReadId", "showWhatsNewPopup", "showNotificationPrimerSheet", "notificationPrimerSource", "Lio/elevenlabs/domain/model/NotificationPrimerSource;", "notificationPrimerModel", "Lio/elevenlabs/domain/model/NotificationPrimerModel;", "<init>", "(ZZLjava/lang/String;Lio/elevenlabs/domain/model/home/HomePageV4;Ljava/util/List;Ljava/util/List;JZLjava/lang/Boolean;Lio/elevenlabs/domain/model/User;Ljava/util/Map;Ljava/lang/String;ZZLio/elevenlabs/domain/model/NotificationPrimerSource;Lio/elevenlabs/domain/model/NotificationPrimerModel;)V", "()Z", "getError", "()Ljava/lang/String;", "getPage", "()Lio/elevenlabs/domain/model/home/HomePageV4;", "getRecentReads", "()Ljava/util/List;", "getPlayerQueue", "getTargetStreakGoalMinutes", "()J", "getShowDailyStreakSettings", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUser", "()Lio/elevenlabs/domain/model/User;", "getLocalizedPrices", "()Ljava/util/Map;", "getPlayingPreviewReadId", "getShowWhatsNewPopup", "getShowNotificationPrimerSheet", "getNotificationPrimerSource", "()Lio/elevenlabs/domain/model/NotificationPrimerSource;", "getNotificationPrimerModel", "()Lio/elevenlabs/domain/model/NotificationPrimerModel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(ZZLjava/lang/String;Lio/elevenlabs/domain/model/home/HomePageV4;Ljava/util/List;Ljava/util/List;JZLjava/lang/Boolean;Lio/elevenlabs/domain/model/User;Ljava/util/Map;Ljava/lang/String;ZZLio/elevenlabs/domain/model/NotificationPrimerSource;Lio/elevenlabs/domain/model/NotificationPrimerModel;)Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v4/HomeStateV4;", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class HomeStateV4 {
    public static final int $stable = 8;
    private final String error;
    private final Boolean isFreeUser;
    private final boolean isLoading;
    private final boolean isScreenVisible;
    private final Map<String, MoneyPrice> localizedPrices;
    private final NotificationPrimerModel notificationPrimerModel;
    private final NotificationPrimerSource notificationPrimerSource;
    private final HomePageV4 page;
    private final List<MediaItemState> playerQueue;
    private final String playingPreviewReadId;
    private final List<ReadMeta> recentReads;
    private final boolean showDailyStreakSettings;
    private final boolean showNotificationPrimerSheet;
    private final boolean showWhatsNewPopup;
    private final long targetStreakGoalMinutes;
    private final User user;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ HomeStateV4(boolean z6, boolean z10, String str, HomePageV4 homePageV4, List list, List list2, long j4, boolean z11, Boolean bool, User user, Map map, String str2, boolean z12, boolean z13, NotificationPrimerSource notificationPrimerSource, NotificationPrimerModel notificationPrimerModel, int i10, kotlin.jvm.internal.f fVar) {
        this(r18, r2, r4, r5, r7, r8, r9, r11, r12, r13, r14, r15, r3, r6, r1, r35);
        boolean z14;
        boolean z15;
        String str3;
        HomePageV4 homePageV42;
        List list3;
        long j10;
        boolean z16;
        Boolean bool2;
        User user2;
        Map map2;
        String str4;
        boolean z17;
        boolean z18;
        NotificationPrimerSource notificationPrimerSource2;
        NotificationPrimerModel notificationPrimerModel2;
        if ((i10 & 1) != 0) {
            z14 = true;
        } else {
            z14 = z6;
        }
        if ((i10 & 2) != 0) {
            z15 = false;
        } else {
            z15 = z10;
        }
        if ((i10 & 4) != 0) {
            str3 = "";
        } else {
            str3 = str;
        }
        if ((i10 & 8) != 0) {
            homePageV42 = null;
        } else {
            homePageV42 = homePageV4;
        }
        int i11 = i10 & 16;
        List list4 = tn.t.f33547a;
        if (i11 != 0) {
            list3 = list4;
        } else {
            list3 = list;
        }
        list4 = (i10 & 32) == 0 ? list2 : list4;
        if ((i10 & 64) != 0) {
            j10 = 0;
        } else {
            j10 = j4;
        }
        if ((i10 & 128) != 0) {
            z16 = false;
        } else {
            z16 = z11;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        if ((i10 & 512) != 0) {
            user2 = null;
        } else {
            user2 = user;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            map2 = null;
        } else {
            map2 = map;
        }
        if ((i10 & 2048) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i10 & 4096) != 0) {
            z17 = false;
        } else {
            z17 = z12;
        }
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            z18 = false;
        } else {
            z18 = z13;
        }
        boolean z19 = z14;
        if ((i10 & 16384) != 0) {
            notificationPrimerSource2 = null;
        } else {
            notificationPrimerSource2 = notificationPrimerSource;
        }
        if ((i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            notificationPrimerModel2 = null;
        } else {
            notificationPrimerModel2 = notificationPrimerModel;
        }
    }

    public static /* synthetic */ HomeStateV4 copy$default(HomeStateV4 homeStateV4, boolean z6, boolean z10, String str, HomePageV4 homePageV4, List list, List list2, long j4, boolean z11, Boolean bool, User user, Map map, String str2, boolean z12, boolean z13, NotificationPrimerSource notificationPrimerSource, NotificationPrimerModel notificationPrimerModel, int i10, Object obj) {
        boolean z14;
        boolean z15;
        String str3;
        HomePageV4 homePageV42;
        List list3;
        List list4;
        long j10;
        boolean z16;
        Boolean bool2;
        User user2;
        Map map2;
        String str4;
        boolean z17;
        boolean z18;
        NotificationPrimerSource notificationPrimerSource2;
        NotificationPrimerModel notificationPrimerModel2;
        if ((i10 & 1) != 0) {
            z14 = homeStateV4.isScreenVisible;
        } else {
            z14 = z6;
        }
        if ((i10 & 2) != 0) {
            z15 = homeStateV4.isLoading;
        } else {
            z15 = z10;
        }
        if ((i10 & 4) != 0) {
            str3 = homeStateV4.error;
        } else {
            str3 = str;
        }
        if ((i10 & 8) != 0) {
            homePageV42 = homeStateV4.page;
        } else {
            homePageV42 = homePageV4;
        }
        if ((i10 & 16) != 0) {
            list3 = homeStateV4.recentReads;
        } else {
            list3 = list;
        }
        if ((i10 & 32) != 0) {
            list4 = homeStateV4.playerQueue;
        } else {
            list4 = list2;
        }
        if ((i10 & 64) != 0) {
            j10 = homeStateV4.targetStreakGoalMinutes;
        } else {
            j10 = j4;
        }
        if ((i10 & 128) != 0) {
            z16 = homeStateV4.showDailyStreakSettings;
        } else {
            z16 = z11;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            bool2 = homeStateV4.isFreeUser;
        } else {
            bool2 = bool;
        }
        if ((i10 & 512) != 0) {
            user2 = homeStateV4.user;
        } else {
            user2 = user;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            map2 = homeStateV4.localizedPrices;
        } else {
            map2 = map;
        }
        if ((i10 & 2048) != 0) {
            str4 = homeStateV4.playingPreviewReadId;
        } else {
            str4 = str2;
        }
        if ((i10 & 4096) != 0) {
            z17 = homeStateV4.showWhatsNewPopup;
        } else {
            z17 = z12;
        }
        boolean z19 = z14;
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            z18 = homeStateV4.showNotificationPrimerSheet;
        } else {
            z18 = z13;
        }
        boolean z20 = z18;
        if ((i10 & 16384) != 0) {
            notificationPrimerSource2 = homeStateV4.notificationPrimerSource;
        } else {
            notificationPrimerSource2 = notificationPrimerSource;
        }
        if ((i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            notificationPrimerModel2 = homeStateV4.notificationPrimerModel;
        } else {
            notificationPrimerModel2 = notificationPrimerModel;
        }
        return homeStateV4.copy(z19, z15, str3, homePageV42, list3, list4, j10, z16, bool2, user2, map2, str4, z17, z20, notificationPrimerSource2, notificationPrimerModel2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsScreenVisible() {
        return this.isScreenVisible;
    }

    /* renamed from: component10, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    public final Map<String, MoneyPrice> component11() {
        return this.localizedPrices;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPlayingPreviewReadId() {
        return this.playingPreviewReadId;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getShowWhatsNewPopup() {
        return this.showWhatsNewPopup;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getShowNotificationPrimerSheet() {
        return this.showNotificationPrimerSheet;
    }

    /* renamed from: component15, reason: from getter */
    public final NotificationPrimerSource getNotificationPrimerSource() {
        return this.notificationPrimerSource;
    }

    /* renamed from: component16, reason: from getter */
    public final NotificationPrimerModel getNotificationPrimerModel() {
        return this.notificationPrimerModel;
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
    public final HomePageV4 getPage() {
        return this.page;
    }

    public final List<ReadMeta> component5() {
        return this.recentReads;
    }

    public final List<MediaItemState> component6() {
        return this.playerQueue;
    }

    /* renamed from: component7, reason: from getter */
    public final long getTargetStreakGoalMinutes() {
        return this.targetStreakGoalMinutes;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowDailyStreakSettings() {
        return this.showDailyStreakSettings;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getIsFreeUser() {
        return this.isFreeUser;
    }

    public final HomeStateV4 copy(boolean isScreenVisible, boolean isLoading, String error, HomePageV4 page, List<ReadMeta> recentReads, List<MediaItemState> playerQueue, long targetStreakGoalMinutes, boolean showDailyStreakSettings, Boolean isFreeUser, User user, Map<String, MoneyPrice> localizedPrices, String playingPreviewReadId, boolean showWhatsNewPopup, boolean showNotificationPrimerSheet, NotificationPrimerSource notificationPrimerSource, NotificationPrimerModel notificationPrimerModel) {
        error.getClass();
        recentReads.getClass();
        playerQueue.getClass();
        return new HomeStateV4(isScreenVisible, isLoading, error, page, recentReads, playerQueue, targetStreakGoalMinutes, showDailyStreakSettings, isFreeUser, user, localizedPrices, playingPreviewReadId, showWhatsNewPopup, showNotificationPrimerSheet, notificationPrimerSource, notificationPrimerModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeStateV4)) {
            return false;
        }
        HomeStateV4 homeStateV4 = (HomeStateV4) other;
        if (this.isScreenVisible == homeStateV4.isScreenVisible && this.isLoading == homeStateV4.isLoading && kotlin.jvm.internal.m.c(this.error, homeStateV4.error) && kotlin.jvm.internal.m.c(this.page, homeStateV4.page) && kotlin.jvm.internal.m.c(this.recentReads, homeStateV4.recentReads) && kotlin.jvm.internal.m.c(this.playerQueue, homeStateV4.playerQueue) && this.targetStreakGoalMinutes == homeStateV4.targetStreakGoalMinutes && this.showDailyStreakSettings == homeStateV4.showDailyStreakSettings && kotlin.jvm.internal.m.c(this.isFreeUser, homeStateV4.isFreeUser) && kotlin.jvm.internal.m.c(this.user, homeStateV4.user) && kotlin.jvm.internal.m.c(this.localizedPrices, homeStateV4.localizedPrices) && kotlin.jvm.internal.m.c(this.playingPreviewReadId, homeStateV4.playingPreviewReadId) && this.showWhatsNewPopup == homeStateV4.showWhatsNewPopup && this.showNotificationPrimerSheet == homeStateV4.showNotificationPrimerSheet && this.notificationPrimerSource == homeStateV4.notificationPrimerSource && kotlin.jvm.internal.m.c(this.notificationPrimerModel, homeStateV4.notificationPrimerModel)) {
            return true;
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final Map<String, MoneyPrice> getLocalizedPrices() {
        return this.localizedPrices;
    }

    public final NotificationPrimerModel getNotificationPrimerModel() {
        return this.notificationPrimerModel;
    }

    public final NotificationPrimerSource getNotificationPrimerSource() {
        return this.notificationPrimerSource;
    }

    public final HomePageV4 getPage() {
        return this.page;
    }

    public final List<MediaItemState> getPlayerQueue() {
        return this.playerQueue;
    }

    public final String getPlayingPreviewReadId() {
        return this.playingPreviewReadId;
    }

    public final List<ReadMeta> getRecentReads() {
        return this.recentReads;
    }

    public final boolean getShowDailyStreakSettings() {
        return this.showDailyStreakSettings;
    }

    public final boolean getShowNotificationPrimerSheet() {
        return this.showNotificationPrimerSheet;
    }

    public final boolean getShowWhatsNewPopup() {
        return this.showWhatsNewPopup;
    }

    public final long getTargetStreakGoalMinutes() {
        return this.targetStreakGoalMinutes;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int c5 = j0.c.c(com.google.android.gms.internal.play_billing.b.f(Boolean.hashCode(this.isScreenVisible) * 31, 31, this.isLoading), 31, this.error);
        HomePageV4 homePageV4 = this.page;
        int i10 = 0;
        if (homePageV4 == null) {
            hashCode = 0;
        } else {
            hashCode = homePageV4.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.g(this.targetStreakGoalMinutes, p.n.d(p.n.d((c5 + hashCode) * 31, 31, this.recentReads), 31, this.playerQueue), 31), 31, this.showDailyStreakSettings);
        Boolean bool = this.isFreeUser;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i11 = (f10 + hashCode2) * 31;
        User user = this.user;
        if (user == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = user.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Map<String, MoneyPrice> map = this.localizedPrices;
        if (map == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = map.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str = this.playingPreviewReadId;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int f11 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((i13 + hashCode5) * 31, 31, this.showWhatsNewPopup), 31, this.showNotificationPrimerSheet);
        NotificationPrimerSource notificationPrimerSource = this.notificationPrimerSource;
        if (notificationPrimerSource == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = notificationPrimerSource.hashCode();
        }
        int i14 = (f11 + hashCode6) * 31;
        NotificationPrimerModel notificationPrimerModel = this.notificationPrimerModel;
        if (notificationPrimerModel != null) {
            i10 = notificationPrimerModel.hashCode();
        }
        return i14 + i10;
    }

    public final Boolean isFreeUser() {
        return this.isFreeUser;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isScreenVisible() {
        return this.isScreenVisible;
    }

    public String toString() {
        return "HomeStateV4(isScreenVisible=" + this.isScreenVisible + ", isLoading=" + this.isLoading + ", error=" + this.error + ", page=" + this.page + ", recentReads=" + this.recentReads + ", playerQueue=" + this.playerQueue + ", targetStreakGoalMinutes=" + this.targetStreakGoalMinutes + ", showDailyStreakSettings=" + this.showDailyStreakSettings + ", isFreeUser=" + this.isFreeUser + ", user=" + this.user + ", localizedPrices=" + this.localizedPrices + ", playingPreviewReadId=" + this.playingPreviewReadId + ", showWhatsNewPopup=" + this.showWhatsNewPopup + ", showNotificationPrimerSheet=" + this.showNotificationPrimerSheet + ", notificationPrimerSource=" + this.notificationPrimerSource + ", notificationPrimerModel=" + this.notificationPrimerModel + Separators.RPAREN;
    }

    public HomeStateV4(boolean z6, boolean z10, String str, HomePageV4 homePageV4, List<ReadMeta> list, List<MediaItemState> list2, long j4, boolean z11, Boolean bool, User user, Map<String, MoneyPrice> map, String str2, boolean z12, boolean z13, NotificationPrimerSource notificationPrimerSource, NotificationPrimerModel notificationPrimerModel) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.isScreenVisible = z6;
        this.isLoading = z10;
        this.error = str;
        this.page = homePageV4;
        this.recentReads = list;
        this.playerQueue = list2;
        this.targetStreakGoalMinutes = j4;
        this.showDailyStreakSettings = z11;
        this.isFreeUser = bool;
        this.user = user;
        this.localizedPrices = map;
        this.playingPreviewReadId = str2;
        this.showWhatsNewPopup = z12;
        this.showNotificationPrimerSheet = z13;
        this.notificationPrimerSource = notificationPrimerSource;
        this.notificationPrimerModel = notificationPrimerModel;
    }

    public HomeStateV4() {
        this(false, false, null, null, null, null, 0L, false, null, null, null, null, false, false, null, null, 65535, null);
    }
}

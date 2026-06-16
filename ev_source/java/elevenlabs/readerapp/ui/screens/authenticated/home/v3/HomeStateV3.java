package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3;

import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.NotificationPrimerModel;
import io.elevenlabs.domain.model.NotificationPrimerSource;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.home.HomePageV3;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0003J\t\u00108\u001a\u00020\u000fHÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010(J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00130\nHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u001aHÆ\u0003JÀ\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010BJ\u0014\u0010C\u001a\u00020\u00032\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010E\u001a\u00020FHÖ\u0081\u0004J\n\u0010G\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010)\u001a\u0004\b\u0011\u0010(R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006H"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v3/HomeStateV3;", "", "isScreenVisible", "", "isLoading", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "page", "Lio/elevenlabs/domain/model/home/HomePageV3;", "recentReads", "", "Lio/elevenlabs/domain/model/ReadMeta;", "playerQueue", "Lio/elevenlabs/domain/model/MediaItemState;", "targetStreakGoalMinutes", "", "showDailyStreakSettings", "isFreeUser", "followedSeries", "Lio/elevenlabs/domain/model/CollectionMeta;", "selectedSubpageId", "showWhatsNewPopup", "showNotificationPrimerSheet", "notificationPrimerSource", "Lio/elevenlabs/domain/model/NotificationPrimerSource;", "notificationPrimerModel", "Lio/elevenlabs/domain/model/NotificationPrimerModel;", "<init>", "(ZZLjava/lang/String;Lio/elevenlabs/domain/model/home/HomePageV3;Ljava/util/List;Ljava/util/List;JZLjava/lang/Boolean;Ljava/util/List;Ljava/lang/String;ZZLio/elevenlabs/domain/model/NotificationPrimerSource;Lio/elevenlabs/domain/model/NotificationPrimerModel;)V", "()Z", "getError", "()Ljava/lang/String;", "getPage", "()Lio/elevenlabs/domain/model/home/HomePageV3;", "getRecentReads", "()Ljava/util/List;", "getPlayerQueue", "getTargetStreakGoalMinutes", "()J", "getShowDailyStreakSettings", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFollowedSeries", "getSelectedSubpageId", "getShowWhatsNewPopup", "getShowNotificationPrimerSheet", "getNotificationPrimerSource", "()Lio/elevenlabs/domain/model/NotificationPrimerSource;", "getNotificationPrimerModel", "()Lio/elevenlabs/domain/model/NotificationPrimerModel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(ZZLjava/lang/String;Lio/elevenlabs/domain/model/home/HomePageV3;Ljava/util/List;Ljava/util/List;JZLjava/lang/Boolean;Ljava/util/List;Ljava/lang/String;ZZLio/elevenlabs/domain/model/NotificationPrimerSource;Lio/elevenlabs/domain/model/NotificationPrimerModel;)Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v3/HomeStateV3;", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class HomeStateV3 {
    public static final int $stable = 8;
    private final String error;
    private final List<CollectionMeta> followedSeries;
    private final Boolean isFreeUser;
    private final boolean isLoading;
    private final boolean isScreenVisible;
    private final NotificationPrimerModel notificationPrimerModel;
    private final NotificationPrimerSource notificationPrimerSource;
    private final HomePageV3 page;
    private final List<MediaItemState> playerQueue;
    private final List<ReadMeta> recentReads;
    private final String selectedSubpageId;
    private final boolean showDailyStreakSettings;
    private final boolean showNotificationPrimerSheet;
    private final boolean showWhatsNewPopup;
    private final long targetStreakGoalMinutes;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ HomeStateV3(boolean z6, boolean z10, String str, HomePageV3 homePageV3, List list, List list2, long j4, boolean z11, Boolean bool, List list3, String str2, boolean z12, boolean z13, NotificationPrimerSource notificationPrimerSource, NotificationPrimerModel notificationPrimerModel, int i10, kotlin.jvm.internal.f fVar) {
        this(r1, r2, r4, r5, r7, r9, r10, r12, r13, r8, r14, r15, r3, r6, r33);
        boolean z14;
        boolean z15;
        String str3;
        HomePageV3 homePageV32;
        List list4;
        List list5;
        long j10;
        boolean z16;
        Boolean bool2;
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
            homePageV32 = null;
        } else {
            homePageV32 = homePageV3;
        }
        int i11 = i10 & 16;
        List list6 = tn.t.f33547a;
        if (i11 != 0) {
            list4 = list6;
        } else {
            list4 = list;
        }
        if ((i10 & 32) != 0) {
            list5 = list6;
        } else {
            list5 = list2;
        }
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
        list6 = (i10 & 512) == 0 ? list3 : list6;
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i10 & 2048) != 0) {
            z17 = false;
        } else {
            z17 = z12;
        }
        if ((i10 & 4096) != 0) {
            z18 = false;
        } else {
            z18 = z13;
        }
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            notificationPrimerSource2 = null;
        } else {
            notificationPrimerSource2 = notificationPrimerSource;
        }
        if ((i10 & 16384) != 0) {
            notificationPrimerModel2 = null;
        } else {
            notificationPrimerModel2 = notificationPrimerModel;
        }
    }

    public static /* synthetic */ HomeStateV3 copy$default(HomeStateV3 homeStateV3, boolean z6, boolean z10, String str, HomePageV3 homePageV3, List list, List list2, long j4, boolean z11, Boolean bool, List list3, String str2, boolean z12, boolean z13, NotificationPrimerSource notificationPrimerSource, NotificationPrimerModel notificationPrimerModel, int i10, Object obj) {
        boolean z14;
        boolean z15;
        String str3;
        HomePageV3 homePageV32;
        List list4;
        List list5;
        long j10;
        boolean z16;
        Boolean bool2;
        List list6;
        String str4;
        boolean z17;
        boolean z18;
        NotificationPrimerSource notificationPrimerSource2;
        NotificationPrimerModel notificationPrimerModel2;
        if ((i10 & 1) != 0) {
            z14 = homeStateV3.isScreenVisible;
        } else {
            z14 = z6;
        }
        if ((i10 & 2) != 0) {
            z15 = homeStateV3.isLoading;
        } else {
            z15 = z10;
        }
        if ((i10 & 4) != 0) {
            str3 = homeStateV3.error;
        } else {
            str3 = str;
        }
        if ((i10 & 8) != 0) {
            homePageV32 = homeStateV3.page;
        } else {
            homePageV32 = homePageV3;
        }
        if ((i10 & 16) != 0) {
            list4 = homeStateV3.recentReads;
        } else {
            list4 = list;
        }
        if ((i10 & 32) != 0) {
            list5 = homeStateV3.playerQueue;
        } else {
            list5 = list2;
        }
        if ((i10 & 64) != 0) {
            j10 = homeStateV3.targetStreakGoalMinutes;
        } else {
            j10 = j4;
        }
        if ((i10 & 128) != 0) {
            z16 = homeStateV3.showDailyStreakSettings;
        } else {
            z16 = z11;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            bool2 = homeStateV3.isFreeUser;
        } else {
            bool2 = bool;
        }
        if ((i10 & 512) != 0) {
            list6 = homeStateV3.followedSeries;
        } else {
            list6 = list3;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            str4 = homeStateV3.selectedSubpageId;
        } else {
            str4 = str2;
        }
        if ((i10 & 2048) != 0) {
            z17 = homeStateV3.showWhatsNewPopup;
        } else {
            z17 = z12;
        }
        if ((i10 & 4096) != 0) {
            z18 = homeStateV3.showNotificationPrimerSheet;
        } else {
            z18 = z13;
        }
        boolean z19 = z14;
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            notificationPrimerSource2 = homeStateV3.notificationPrimerSource;
        } else {
            notificationPrimerSource2 = notificationPrimerSource;
        }
        if ((i10 & 16384) != 0) {
            notificationPrimerModel2 = homeStateV3.notificationPrimerModel;
        } else {
            notificationPrimerModel2 = notificationPrimerModel;
        }
        return homeStateV3.copy(z19, z15, str3, homePageV32, list4, list5, j10, z16, bool2, list6, str4, z17, z18, notificationPrimerSource2, notificationPrimerModel2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsScreenVisible() {
        return this.isScreenVisible;
    }

    public final List<CollectionMeta> component10() {
        return this.followedSeries;
    }

    /* renamed from: component11, reason: from getter */
    public final String getSelectedSubpageId() {
        return this.selectedSubpageId;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getShowWhatsNewPopup() {
        return this.showWhatsNewPopup;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getShowNotificationPrimerSheet() {
        return this.showNotificationPrimerSheet;
    }

    /* renamed from: component14, reason: from getter */
    public final NotificationPrimerSource getNotificationPrimerSource() {
        return this.notificationPrimerSource;
    }

    /* renamed from: component15, reason: from getter */
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
    public final HomePageV3 getPage() {
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

    public final HomeStateV3 copy(boolean isScreenVisible, boolean isLoading, String error, HomePageV3 page, List<ReadMeta> recentReads, List<MediaItemState> playerQueue, long targetStreakGoalMinutes, boolean showDailyStreakSettings, Boolean isFreeUser, List<CollectionMeta> followedSeries, String selectedSubpageId, boolean showWhatsNewPopup, boolean showNotificationPrimerSheet, NotificationPrimerSource notificationPrimerSource, NotificationPrimerModel notificationPrimerModel) {
        error.getClass();
        recentReads.getClass();
        playerQueue.getClass();
        followedSeries.getClass();
        return new HomeStateV3(isScreenVisible, isLoading, error, page, recentReads, playerQueue, targetStreakGoalMinutes, showDailyStreakSettings, isFreeUser, followedSeries, selectedSubpageId, showWhatsNewPopup, showNotificationPrimerSheet, notificationPrimerSource, notificationPrimerModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeStateV3)) {
            return false;
        }
        HomeStateV3 homeStateV3 = (HomeStateV3) other;
        if (this.isScreenVisible == homeStateV3.isScreenVisible && this.isLoading == homeStateV3.isLoading && kotlin.jvm.internal.m.c(this.error, homeStateV3.error) && kotlin.jvm.internal.m.c(this.page, homeStateV3.page) && kotlin.jvm.internal.m.c(this.recentReads, homeStateV3.recentReads) && kotlin.jvm.internal.m.c(this.playerQueue, homeStateV3.playerQueue) && this.targetStreakGoalMinutes == homeStateV3.targetStreakGoalMinutes && this.showDailyStreakSettings == homeStateV3.showDailyStreakSettings && kotlin.jvm.internal.m.c(this.isFreeUser, homeStateV3.isFreeUser) && kotlin.jvm.internal.m.c(this.followedSeries, homeStateV3.followedSeries) && kotlin.jvm.internal.m.c(this.selectedSubpageId, homeStateV3.selectedSubpageId) && this.showWhatsNewPopup == homeStateV3.showWhatsNewPopup && this.showNotificationPrimerSheet == homeStateV3.showNotificationPrimerSheet && this.notificationPrimerSource == homeStateV3.notificationPrimerSource && kotlin.jvm.internal.m.c(this.notificationPrimerModel, homeStateV3.notificationPrimerModel)) {
            return true;
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final List<CollectionMeta> getFollowedSeries() {
        return this.followedSeries;
    }

    public final NotificationPrimerModel getNotificationPrimerModel() {
        return this.notificationPrimerModel;
    }

    public final NotificationPrimerSource getNotificationPrimerSource() {
        return this.notificationPrimerSource;
    }

    public final HomePageV3 getPage() {
        return this.page;
    }

    public final List<MediaItemState> getPlayerQueue() {
        return this.playerQueue;
    }

    public final List<ReadMeta> getRecentReads() {
        return this.recentReads;
    }

    public final String getSelectedSubpageId() {
        return this.selectedSubpageId;
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

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int c5 = j0.c.c(com.google.android.gms.internal.play_billing.b.f(Boolean.hashCode(this.isScreenVisible) * 31, 31, this.isLoading), 31, this.error);
        HomePageV3 homePageV3 = this.page;
        int i10 = 0;
        if (homePageV3 == null) {
            hashCode = 0;
        } else {
            hashCode = homePageV3.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.g(this.targetStreakGoalMinutes, p.n.d(p.n.d((c5 + hashCode) * 31, 31, this.recentReads), 31, this.playerQueue), 31), 31, this.showDailyStreakSettings);
        Boolean bool = this.isFreeUser;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int d10 = p.n.d((f10 + hashCode2) * 31, 31, this.followedSeries);
        String str = this.selectedSubpageId;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int f11 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((d10 + hashCode3) * 31, 31, this.showWhatsNewPopup), 31, this.showNotificationPrimerSheet);
        NotificationPrimerSource notificationPrimerSource = this.notificationPrimerSource;
        if (notificationPrimerSource == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = notificationPrimerSource.hashCode();
        }
        int i11 = (f11 + hashCode4) * 31;
        NotificationPrimerModel notificationPrimerModel = this.notificationPrimerModel;
        if (notificationPrimerModel != null) {
            i10 = notificationPrimerModel.hashCode();
        }
        return i11 + i10;
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
        return "HomeStateV3(isScreenVisible=" + this.isScreenVisible + ", isLoading=" + this.isLoading + ", error=" + this.error + ", page=" + this.page + ", recentReads=" + this.recentReads + ", playerQueue=" + this.playerQueue + ", targetStreakGoalMinutes=" + this.targetStreakGoalMinutes + ", showDailyStreakSettings=" + this.showDailyStreakSettings + ", isFreeUser=" + this.isFreeUser + ", followedSeries=" + this.followedSeries + ", selectedSubpageId=" + this.selectedSubpageId + ", showWhatsNewPopup=" + this.showWhatsNewPopup + ", showNotificationPrimerSheet=" + this.showNotificationPrimerSheet + ", notificationPrimerSource=" + this.notificationPrimerSource + ", notificationPrimerModel=" + this.notificationPrimerModel + Separators.RPAREN;
    }

    public HomeStateV3(boolean z6, boolean z10, String str, HomePageV3 homePageV3, List<ReadMeta> list, List<MediaItemState> list2, long j4, boolean z11, Boolean bool, List<CollectionMeta> list3, String str2, boolean z12, boolean z13, NotificationPrimerSource notificationPrimerSource, NotificationPrimerModel notificationPrimerModel) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.isScreenVisible = z6;
        this.isLoading = z10;
        this.error = str;
        this.page = homePageV3;
        this.recentReads = list;
        this.playerQueue = list2;
        this.targetStreakGoalMinutes = j4;
        this.showDailyStreakSettings = z11;
        this.isFreeUser = bool;
        this.followedSeries = list3;
        this.selectedSubpageId = str2;
        this.showWhatsNewPopup = z12;
        this.showNotificationPrimerSheet = z13;
        this.notificationPrimerSource = notificationPrimerSource;
        this.notificationPrimerModel = notificationPrimerModel;
    }

    public HomeStateV3() {
        this(false, false, null, null, null, null, 0L, false, null, null, null, false, false, null, null, 32767, null);
    }
}

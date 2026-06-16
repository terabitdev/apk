package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0092\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00109J\u0014\u0010:\u001a\u00020\u00132\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010<\u001a\u00020=HÖ\u0081\u0004J\n\u0010>\u001a\u00020\u0010HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b,\u0010\u0018¨\u0006?"}, d2 = {"Lio/elevenlabs/domain/model/UserConfigRequest;", "", "dailyStreakMinutes", "", "playbackSpeedRate", "", "playerFontFamily", "Lio/elevenlabs/domain/model/PlayerFontFamily;", "playerFontSize", "playerTheme", "Lio/elevenlabs/domain/model/PlayerTheme;", "playerActionButton", "Lio/elevenlabs/domain/model/PlayerActionButton;", "playerDisplayMode", "Lio/elevenlabs/domain/model/PlayerDisplayMode;", "genfmLanguage", "", "storeCountryCode", "matureContentEnabled", "", "voiceAssistantTermsAgreedAt", "<init>", "(Ljava/lang/Long;Ljava/lang/Float;Lio/elevenlabs/domain/model/PlayerFontFamily;Ljava/lang/Long;Lio/elevenlabs/domain/model/PlayerTheme;Lio/elevenlabs/domain/model/PlayerActionButton;Lio/elevenlabs/domain/model/PlayerDisplayMode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)V", "getDailyStreakMinutes", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPlaybackSpeedRate", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getPlayerFontFamily", "()Lio/elevenlabs/domain/model/PlayerFontFamily;", "getPlayerFontSize", "getPlayerTheme", "()Lio/elevenlabs/domain/model/PlayerTheme;", "getPlayerActionButton", "()Lio/elevenlabs/domain/model/PlayerActionButton;", "getPlayerDisplayMode", "()Lio/elevenlabs/domain/model/PlayerDisplayMode;", "getGenfmLanguage", "()Ljava/lang/String;", "getStoreCountryCode", "getMatureContentEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVoiceAssistantTermsAgreedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/Long;Ljava/lang/Float;Lio/elevenlabs/domain/model/PlayerFontFamily;Ljava/lang/Long;Lio/elevenlabs/domain/model/PlayerTheme;Lio/elevenlabs/domain/model/PlayerActionButton;Lio/elevenlabs/domain/model/PlayerDisplayMode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)Lio/elevenlabs/domain/model/UserConfigRequest;", "equals", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class UserConfigRequest {
    private final Long dailyStreakMinutes;
    private final String genfmLanguage;
    private final Boolean matureContentEnabled;
    private final Float playbackSpeedRate;
    private final PlayerActionButton playerActionButton;
    private final PlayerDisplayMode playerDisplayMode;
    private final PlayerFontFamily playerFontFamily;
    private final Long playerFontSize;
    private final PlayerTheme playerTheme;
    private final String storeCountryCode;
    private final Long voiceAssistantTermsAgreedAt;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ UserConfigRequest(Long l4, Float f10, PlayerFontFamily playerFontFamily, Long l7, PlayerTheme playerTheme, PlayerActionButton playerActionButton, PlayerDisplayMode playerDisplayMode, String str, String str2, Boolean bool, Long l10, int i10, f fVar) {
        this(l4, f10, playerFontFamily, l7, playerTheme, playerActionButton, playerDisplayMode, str, str2, bool, r13);
        Long l11;
        l4 = (i10 & 1) != 0 ? null : l4;
        f10 = (i10 & 2) != 0 ? null : f10;
        playerFontFamily = (i10 & 4) != 0 ? null : playerFontFamily;
        l7 = (i10 & 8) != 0 ? null : l7;
        playerTheme = (i10 & 16) != 0 ? null : playerTheme;
        playerActionButton = (i10 & 32) != 0 ? null : playerActionButton;
        playerDisplayMode = (i10 & 64) != 0 ? null : playerDisplayMode;
        str = (i10 & 128) != 0 ? null : str;
        str2 = (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? null : str2;
        bool = (i10 & 512) != 0 ? null : bool;
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            l11 = null;
        } else {
            l11 = l10;
        }
    }

    public static /* synthetic */ UserConfigRequest copy$default(UserConfigRequest userConfigRequest, Long l4, Float f10, PlayerFontFamily playerFontFamily, Long l7, PlayerTheme playerTheme, PlayerActionButton playerActionButton, PlayerDisplayMode playerDisplayMode, String str, String str2, Boolean bool, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l4 = userConfigRequest.dailyStreakMinutes;
        }
        if ((i10 & 2) != 0) {
            f10 = userConfigRequest.playbackSpeedRate;
        }
        if ((i10 & 4) != 0) {
            playerFontFamily = userConfigRequest.playerFontFamily;
        }
        if ((i10 & 8) != 0) {
            l7 = userConfigRequest.playerFontSize;
        }
        if ((i10 & 16) != 0) {
            playerTheme = userConfigRequest.playerTheme;
        }
        if ((i10 & 32) != 0) {
            playerActionButton = userConfigRequest.playerActionButton;
        }
        if ((i10 & 64) != 0) {
            playerDisplayMode = userConfigRequest.playerDisplayMode;
        }
        if ((i10 & 128) != 0) {
            str = userConfigRequest.genfmLanguage;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            str2 = userConfigRequest.storeCountryCode;
        }
        if ((i10 & 512) != 0) {
            bool = userConfigRequest.matureContentEnabled;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            l10 = userConfigRequest.voiceAssistantTermsAgreedAt;
        }
        Boolean bool2 = bool;
        Long l11 = l10;
        String str3 = str;
        String str4 = str2;
        PlayerActionButton playerActionButton2 = playerActionButton;
        PlayerDisplayMode playerDisplayMode2 = playerDisplayMode;
        PlayerTheme playerTheme2 = playerTheme;
        PlayerFontFamily playerFontFamily2 = playerFontFamily;
        return userConfigRequest.copy(l4, f10, playerFontFamily2, l7, playerTheme2, playerActionButton2, playerDisplayMode2, str3, str4, bool2, l11);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getDailyStreakMinutes() {
        return this.dailyStreakMinutes;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getMatureContentEnabled() {
        return this.matureContentEnabled;
    }

    /* renamed from: component11, reason: from getter */
    public final Long getVoiceAssistantTermsAgreedAt() {
        return this.voiceAssistantTermsAgreedAt;
    }

    /* renamed from: component2, reason: from getter */
    public final Float getPlaybackSpeedRate() {
        return this.playbackSpeedRate;
    }

    /* renamed from: component3, reason: from getter */
    public final PlayerFontFamily getPlayerFontFamily() {
        return this.playerFontFamily;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getPlayerFontSize() {
        return this.playerFontSize;
    }

    /* renamed from: component5, reason: from getter */
    public final PlayerTheme getPlayerTheme() {
        return this.playerTheme;
    }

    /* renamed from: component6, reason: from getter */
    public final PlayerActionButton getPlayerActionButton() {
        return this.playerActionButton;
    }

    /* renamed from: component7, reason: from getter */
    public final PlayerDisplayMode getPlayerDisplayMode() {
        return this.playerDisplayMode;
    }

    /* renamed from: component8, reason: from getter */
    public final String getGenfmLanguage() {
        return this.genfmLanguage;
    }

    /* renamed from: component9, reason: from getter */
    public final String getStoreCountryCode() {
        return this.storeCountryCode;
    }

    public final UserConfigRequest copy(Long dailyStreakMinutes, Float playbackSpeedRate, PlayerFontFamily playerFontFamily, Long playerFontSize, PlayerTheme playerTheme, PlayerActionButton playerActionButton, PlayerDisplayMode playerDisplayMode, String genfmLanguage, String storeCountryCode, Boolean matureContentEnabled, Long voiceAssistantTermsAgreedAt) {
        return new UserConfigRequest(dailyStreakMinutes, playbackSpeedRate, playerFontFamily, playerFontSize, playerTheme, playerActionButton, playerDisplayMode, genfmLanguage, storeCountryCode, matureContentEnabled, voiceAssistantTermsAgreedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserConfigRequest)) {
            return false;
        }
        UserConfigRequest userConfigRequest = (UserConfigRequest) other;
        if (m.c(this.dailyStreakMinutes, userConfigRequest.dailyStreakMinutes) && m.c(this.playbackSpeedRate, userConfigRequest.playbackSpeedRate) && this.playerFontFamily == userConfigRequest.playerFontFamily && m.c(this.playerFontSize, userConfigRequest.playerFontSize) && this.playerTheme == userConfigRequest.playerTheme && this.playerActionButton == userConfigRequest.playerActionButton && this.playerDisplayMode == userConfigRequest.playerDisplayMode && m.c(this.genfmLanguage, userConfigRequest.genfmLanguage) && m.c(this.storeCountryCode, userConfigRequest.storeCountryCode) && m.c(this.matureContentEnabled, userConfigRequest.matureContentEnabled) && m.c(this.voiceAssistantTermsAgreedAt, userConfigRequest.voiceAssistantTermsAgreedAt)) {
            return true;
        }
        return false;
    }

    public final Long getDailyStreakMinutes() {
        return this.dailyStreakMinutes;
    }

    public final String getGenfmLanguage() {
        return this.genfmLanguage;
    }

    public final Boolean getMatureContentEnabled() {
        return this.matureContentEnabled;
    }

    public final Float getPlaybackSpeedRate() {
        return this.playbackSpeedRate;
    }

    public final PlayerActionButton getPlayerActionButton() {
        return this.playerActionButton;
    }

    public final PlayerDisplayMode getPlayerDisplayMode() {
        return this.playerDisplayMode;
    }

    public final PlayerFontFamily getPlayerFontFamily() {
        return this.playerFontFamily;
    }

    public final Long getPlayerFontSize() {
        return this.playerFontSize;
    }

    public final PlayerTheme getPlayerTheme() {
        return this.playerTheme;
    }

    public final String getStoreCountryCode() {
        return this.storeCountryCode;
    }

    public final Long getVoiceAssistantTermsAgreedAt() {
        return this.voiceAssistantTermsAgreedAt;
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
        int hashCode9;
        int hashCode10;
        Long l4 = this.dailyStreakMinutes;
        int i10 = 0;
        if (l4 == null) {
            hashCode = 0;
        } else {
            hashCode = l4.hashCode();
        }
        int i11 = hashCode * 31;
        Float f10 = this.playbackSpeedRate;
        if (f10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = f10.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        PlayerFontFamily playerFontFamily = this.playerFontFamily;
        if (playerFontFamily == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = playerFontFamily.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Long l7 = this.playerFontSize;
        if (l7 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l7.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        PlayerTheme playerTheme = this.playerTheme;
        if (playerTheme == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = playerTheme.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        PlayerActionButton playerActionButton = this.playerActionButton;
        if (playerActionButton == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = playerActionButton.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        PlayerDisplayMode playerDisplayMode = this.playerDisplayMode;
        if (playerDisplayMode == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = playerDisplayMode.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        String str = this.genfmLanguage;
        if (str == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        String str2 = this.storeCountryCode;
        if (str2 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str2.hashCode();
        }
        int i19 = (i18 + hashCode9) * 31;
        Boolean bool = this.matureContentEnabled;
        if (bool == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = bool.hashCode();
        }
        int i20 = (i19 + hashCode10) * 31;
        Long l10 = this.voiceAssistantTermsAgreedAt;
        if (l10 != null) {
            i10 = l10.hashCode();
        }
        return i20 + i10;
    }

    public String toString() {
        return "UserConfigRequest(dailyStreakMinutes=" + this.dailyStreakMinutes + ", playbackSpeedRate=" + this.playbackSpeedRate + ", playerFontFamily=" + this.playerFontFamily + ", playerFontSize=" + this.playerFontSize + ", playerTheme=" + this.playerTheme + ", playerActionButton=" + this.playerActionButton + ", playerDisplayMode=" + this.playerDisplayMode + ", genfmLanguage=" + this.genfmLanguage + ", storeCountryCode=" + this.storeCountryCode + ", matureContentEnabled=" + this.matureContentEnabled + ", voiceAssistantTermsAgreedAt=" + this.voiceAssistantTermsAgreedAt + Separators.RPAREN;
    }

    public UserConfigRequest(Long l4, Float f10, PlayerFontFamily playerFontFamily, Long l7, PlayerTheme playerTheme, PlayerActionButton playerActionButton, PlayerDisplayMode playerDisplayMode, String str, String str2, Boolean bool, Long l10) {
        this.dailyStreakMinutes = l4;
        this.playbackSpeedRate = f10;
        this.playerFontFamily = playerFontFamily;
        this.playerFontSize = l7;
        this.playerTheme = playerTheme;
        this.playerActionButton = playerActionButton;
        this.playerDisplayMode = playerDisplayMode;
        this.genfmLanguage = str;
        this.storeCountryCode = str2;
        this.matureContentEnabled = bool;
        this.voiceAssistantTermsAgreedAt = l10;
    }

    public UserConfigRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}

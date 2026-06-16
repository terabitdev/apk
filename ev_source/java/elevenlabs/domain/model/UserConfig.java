package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import tn.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u00013Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000eHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\"Jv\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010-J\u0014\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00100\u001a\u000201HÖ\u0081\u0004J\n\u00102\u001a\u00020\tHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"¨\u00064"}, d2 = {"Lio/elevenlabs/domain/model/UserConfig;", "", "dailyStreakMinutes", "", "playbackSpeedRate", "", "player", "Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;", "genfmLanguage", "", "storeCountryCode", "matureContentEnabled", "", "featureFlagVariants", "", "voiceAssistantTermsAgreedAt", "<init>", "(JLjava/lang/Float;Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Long;)V", "getDailyStreakMinutes", "()J", "getPlaybackSpeedRate", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getPlayer", "()Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;", "getGenfmLanguage", "()Ljava/lang/String;", "getStoreCountryCode", "getMatureContentEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFeatureFlagVariants", "()Ljava/util/Map;", "getVoiceAssistantTermsAgreedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(JLjava/lang/Float;Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Long;)Lio/elevenlabs/domain/model/UserConfig;", "equals", "other", "hashCode", "", "toString", "PlayerConfig", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class UserConfig {
    private final long dailyStreakMinutes;
    private final Map<String, String> featureFlagVariants;
    private final String genfmLanguage;
    private final Boolean matureContentEnabled;
    private final Float playbackSpeedRate;
    private final PlayerConfig player;
    private final String storeCountryCode;
    private final Long voiceAssistantTermsAgreedAt;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;", "", "fontSize", "", "fontFamily", "Lio/elevenlabs/domain/model/PlayerFontFamily;", "theme", "Lio/elevenlabs/domain/model/PlayerTheme;", "actionButton", "Lio/elevenlabs/domain/model/PlayerActionButton;", "displayMode", "Lio/elevenlabs/domain/model/PlayerDisplayMode;", "<init>", "(JLio/elevenlabs/domain/model/PlayerFontFamily;Lio/elevenlabs/domain/model/PlayerTheme;Lio/elevenlabs/domain/model/PlayerActionButton;Lio/elevenlabs/domain/model/PlayerDisplayMode;)V", "getFontSize", "()J", "getFontFamily", "()Lio/elevenlabs/domain/model/PlayerFontFamily;", "getTheme", "()Lio/elevenlabs/domain/model/PlayerTheme;", "getActionButton", "()Lio/elevenlabs/domain/model/PlayerActionButton;", "getDisplayMode", "()Lio/elevenlabs/domain/model/PlayerDisplayMode;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class PlayerConfig {
        private final PlayerActionButton actionButton;
        private final PlayerDisplayMode displayMode;
        private final PlayerFontFamily fontFamily;
        private final long fontSize;
        private final PlayerTheme theme;

        public PlayerConfig(long j4, PlayerFontFamily playerFontFamily, PlayerTheme playerTheme, PlayerActionButton playerActionButton, PlayerDisplayMode playerDisplayMode) {
            playerFontFamily.getClass();
            playerTheme.getClass();
            playerActionButton.getClass();
            playerDisplayMode.getClass();
            this.fontSize = j4;
            this.fontFamily = playerFontFamily;
            this.theme = playerTheme;
            this.actionButton = playerActionButton;
            this.displayMode = playerDisplayMode;
        }

        public static /* synthetic */ PlayerConfig copy$default(PlayerConfig playerConfig, long j4, PlayerFontFamily playerFontFamily, PlayerTheme playerTheme, PlayerActionButton playerActionButton, PlayerDisplayMode playerDisplayMode, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = playerConfig.fontSize;
            }
            long j10 = j4;
            if ((i10 & 2) != 0) {
                playerFontFamily = playerConfig.fontFamily;
            }
            PlayerFontFamily playerFontFamily2 = playerFontFamily;
            if ((i10 & 4) != 0) {
                playerTheme = playerConfig.theme;
            }
            PlayerTheme playerTheme2 = playerTheme;
            if ((i10 & 8) != 0) {
                playerActionButton = playerConfig.actionButton;
            }
            PlayerActionButton playerActionButton2 = playerActionButton;
            if ((i10 & 16) != 0) {
                playerDisplayMode = playerConfig.displayMode;
            }
            return playerConfig.copy(j10, playerFontFamily2, playerTheme2, playerActionButton2, playerDisplayMode);
        }

        /* renamed from: component1, reason: from getter */
        public final long getFontSize() {
            return this.fontSize;
        }

        /* renamed from: component2, reason: from getter */
        public final PlayerFontFamily getFontFamily() {
            return this.fontFamily;
        }

        /* renamed from: component3, reason: from getter */
        public final PlayerTheme getTheme() {
            return this.theme;
        }

        /* renamed from: component4, reason: from getter */
        public final PlayerActionButton getActionButton() {
            return this.actionButton;
        }

        /* renamed from: component5, reason: from getter */
        public final PlayerDisplayMode getDisplayMode() {
            return this.displayMode;
        }

        public final PlayerConfig copy(long fontSize, PlayerFontFamily fontFamily, PlayerTheme theme, PlayerActionButton actionButton, PlayerDisplayMode displayMode) {
            fontFamily.getClass();
            theme.getClass();
            actionButton.getClass();
            displayMode.getClass();
            return new PlayerConfig(fontSize, fontFamily, theme, actionButton, displayMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlayerConfig)) {
                return false;
            }
            PlayerConfig playerConfig = (PlayerConfig) other;
            if (this.fontSize == playerConfig.fontSize && this.fontFamily == playerConfig.fontFamily && this.theme == playerConfig.theme && this.actionButton == playerConfig.actionButton && this.displayMode == playerConfig.displayMode) {
                return true;
            }
            return false;
        }

        public final PlayerActionButton getActionButton() {
            return this.actionButton;
        }

        public final PlayerDisplayMode getDisplayMode() {
            return this.displayMode;
        }

        public final PlayerFontFamily getFontFamily() {
            return this.fontFamily;
        }

        public final long getFontSize() {
            return this.fontSize;
        }

        public final PlayerTheme getTheme() {
            return this.theme;
        }

        public int hashCode() {
            return this.displayMode.hashCode() + ((this.actionButton.hashCode() + ((this.theme.hashCode() + ((this.fontFamily.hashCode() + (Long.hashCode(this.fontSize) * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            return "PlayerConfig(fontSize=" + this.fontSize + ", fontFamily=" + this.fontFamily + ", theme=" + this.theme + ", actionButton=" + this.actionButton + ", displayMode=" + this.displayMode + Separators.RPAREN;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ UserConfig(long j4, Float f10, PlayerConfig playerConfig, String str, String str2, Boolean bool, Map map, Long l4, int i10, f fVar) {
        this(j4, f10, playerConfig, str, str2, bool, r9, l4);
        Map map2;
        if ((i10 & 64) != 0) {
            map2 = u.f33548a;
        } else {
            map2 = map;
        }
    }

    public static /* synthetic */ UserConfig copy$default(UserConfig userConfig, long j4, Float f10, PlayerConfig playerConfig, String str, String str2, Boolean bool, Map map, Long l4, int i10, Object obj) {
        String str3;
        Boolean bool2;
        Map map2;
        Long l7;
        if ((i10 & 1) != 0) {
            j4 = userConfig.dailyStreakMinutes;
        }
        long j10 = j4;
        if ((i10 & 2) != 0) {
            f10 = userConfig.playbackSpeedRate;
        }
        Float f11 = f10;
        if ((i10 & 4) != 0) {
            playerConfig = userConfig.player;
        }
        PlayerConfig playerConfig2 = playerConfig;
        if ((i10 & 8) != 0) {
            str = userConfig.genfmLanguage;
        }
        String str4 = str;
        if ((i10 & 16) != 0) {
            str3 = userConfig.storeCountryCode;
        } else {
            str3 = str2;
        }
        if ((i10 & 32) != 0) {
            bool2 = userConfig.matureContentEnabled;
        } else {
            bool2 = bool;
        }
        if ((i10 & 64) != 0) {
            map2 = userConfig.featureFlagVariants;
        } else {
            map2 = map;
        }
        if ((i10 & 128) != 0) {
            l7 = userConfig.voiceAssistantTermsAgreedAt;
        } else {
            l7 = l4;
        }
        return userConfig.copy(j10, f11, playerConfig2, str4, str3, bool2, map2, l7);
    }

    /* renamed from: component1, reason: from getter */
    public final long getDailyStreakMinutes() {
        return this.dailyStreakMinutes;
    }

    /* renamed from: component2, reason: from getter */
    public final Float getPlaybackSpeedRate() {
        return this.playbackSpeedRate;
    }

    /* renamed from: component3, reason: from getter */
    public final PlayerConfig getPlayer() {
        return this.player;
    }

    /* renamed from: component4, reason: from getter */
    public final String getGenfmLanguage() {
        return this.genfmLanguage;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStoreCountryCode() {
        return this.storeCountryCode;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getMatureContentEnabled() {
        return this.matureContentEnabled;
    }

    public final Map<String, String> component7() {
        return this.featureFlagVariants;
    }

    /* renamed from: component8, reason: from getter */
    public final Long getVoiceAssistantTermsAgreedAt() {
        return this.voiceAssistantTermsAgreedAt;
    }

    public final UserConfig copy(long dailyStreakMinutes, Float playbackSpeedRate, PlayerConfig player, String genfmLanguage, String storeCountryCode, Boolean matureContentEnabled, Map<String, String> featureFlagVariants, Long voiceAssistantTermsAgreedAt) {
        player.getClass();
        return new UserConfig(dailyStreakMinutes, playbackSpeedRate, player, genfmLanguage, storeCountryCode, matureContentEnabled, featureFlagVariants, voiceAssistantTermsAgreedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserConfig)) {
            return false;
        }
        UserConfig userConfig = (UserConfig) other;
        if (this.dailyStreakMinutes == userConfig.dailyStreakMinutes && m.c(this.playbackSpeedRate, userConfig.playbackSpeedRate) && m.c(this.player, userConfig.player) && m.c(this.genfmLanguage, userConfig.genfmLanguage) && m.c(this.storeCountryCode, userConfig.storeCountryCode) && m.c(this.matureContentEnabled, userConfig.matureContentEnabled) && m.c(this.featureFlagVariants, userConfig.featureFlagVariants) && m.c(this.voiceAssistantTermsAgreedAt, userConfig.voiceAssistantTermsAgreedAt)) {
            return true;
        }
        return false;
    }

    public final long getDailyStreakMinutes() {
        return this.dailyStreakMinutes;
    }

    public final Map<String, String> getFeatureFlagVariants() {
        return this.featureFlagVariants;
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

    public final PlayerConfig getPlayer() {
        return this.player;
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
        int hashCode6 = Long.hashCode(this.dailyStreakMinutes) * 31;
        Float f10 = this.playbackSpeedRate;
        int i10 = 0;
        if (f10 == null) {
            hashCode = 0;
        } else {
            hashCode = f10.hashCode();
        }
        int hashCode7 = (this.player.hashCode() + ((hashCode6 + hashCode) * 31)) * 31;
        String str = this.genfmLanguage;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (hashCode7 + hashCode2) * 31;
        String str2 = this.storeCountryCode;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Boolean bool = this.matureContentEnabled;
        if (bool == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Map<String, String> map = this.featureFlagVariants;
        if (map == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = map.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        Long l4 = this.voiceAssistantTermsAgreedAt;
        if (l4 != null) {
            i10 = l4.hashCode();
        }
        return i14 + i10;
    }

    public String toString() {
        return "UserConfig(dailyStreakMinutes=" + this.dailyStreakMinutes + ", playbackSpeedRate=" + this.playbackSpeedRate + ", player=" + this.player + ", genfmLanguage=" + this.genfmLanguage + ", storeCountryCode=" + this.storeCountryCode + ", matureContentEnabled=" + this.matureContentEnabled + ", featureFlagVariants=" + this.featureFlagVariants + ", voiceAssistantTermsAgreedAt=" + this.voiceAssistantTermsAgreedAt + Separators.RPAREN;
    }

    public UserConfig(long j4, Float f10, PlayerConfig playerConfig, String str, String str2, Boolean bool, Map<String, String> map, Long l4) {
        playerConfig.getClass();
        this.dailyStreakMinutes = j4;
        this.playbackSpeedRate = f10;
        this.player = playerConfig;
        this.genfmLanguage = str;
        this.storeCountryCode = str2;
        this.matureContentEnabled = bool;
        this.featureFlagVariants = map;
        this.voiceAssistantTermsAgreedAt = l4;
    }
}

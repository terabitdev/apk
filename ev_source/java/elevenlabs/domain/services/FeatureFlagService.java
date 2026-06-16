package io.elevenlabs.domain.services;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import ir.i;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002\u0010\u0011J1\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/FeatureFlagService;", "", "Lio/elevenlabs/domain/services/FeatureFlagService$Flag;", "flag", "", "defaultValue", "logUsage", "Lir/i;", "isFlagEnabled", "(Lio/elevenlabs/domain/services/FeatureFlagService$Flag;ZZ)Lir/i;", "", TokenNames.T, "Lio/elevenlabs/domain/services/FeatureFlagService$Experiment;", "experiment", "getVariant", "(Lio/elevenlabs/domain/services/FeatureFlagService$Experiment;)Lir/i;", "Flag", "Experiment", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface FeatureFlagService {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003J\u0017\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\u0005H&¢\u0006\u0002\u0010\rR\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/FeatureFlagService$Experiment;", TokenNames.T, "", "", "experimentKey", "", "getExperimentKey", "()Ljava/lang/String;", "defaultVariant", "getDefaultVariant", "()Ljava/lang/Enum;", "parseVariant", "value", "(Ljava/lang/String;)Ljava/lang/Enum;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public interface Experiment<T extends Enum<T>> {
        T getDefaultVariant();

        String getExperimentKey();

        T parseVariant(String value);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lio/elevenlabs/domain/services/FeatureFlagService$Flag;", "", SubscriberAttributeKt.JSON_NAME_KEY, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "SCREEN_RECORDING_ENABLED", "SCREEN_RECORDING_PAID_USERS_ENABLED", "VOICE_CHANGER_ENABLED", "SEARCH_IN_AUDIO_ENABLED", "READ_LATER_ENABLED", "AUDIO_BOOKMARKS_ENABLED", "HOME_V4_ENABLED", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Flag extends Enum<Flag> {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Flag[] $VALUES;
        private final String key;
        public static final Flag SCREEN_RECORDING_ENABLED = new Flag("SCREEN_RECORDING_ENABLED", 0, "reader_screen_recording_enabled");
        public static final Flag SCREEN_RECORDING_PAID_USERS_ENABLED = new Flag("SCREEN_RECORDING_PAID_USERS_ENABLED", 1, "reader_screen_recording_paid_users_enabled");
        public static final Flag VOICE_CHANGER_ENABLED = new Flag("VOICE_CHANGER_ENABLED", 2, "reader_voice_changer_enabled");
        public static final Flag SEARCH_IN_AUDIO_ENABLED = new Flag("SEARCH_IN_AUDIO_ENABLED", 3, "reader_search_in_audio_enabled");
        public static final Flag READ_LATER_ENABLED = new Flag("READ_LATER_ENABLED", 4, "reader_read_later_enabled");
        public static final Flag AUDIO_BOOKMARKS_ENABLED = new Flag("AUDIO_BOOKMARKS_ENABLED", 5, "reader_audio_bookmarks_enabled");
        public static final Flag HOME_V4_ENABLED = new Flag("HOME_V4_ENABLED", 6, "reader_home_v4_enabled");

        private static final /* synthetic */ Flag[] $values() {
            return new Flag[]{SCREEN_RECORDING_ENABLED, SCREEN_RECORDING_PAID_USERS_ENABLED, VOICE_CHANGER_ENABLED, SEARCH_IN_AUDIO_ENABLED, READ_LATER_ENABLED, AUDIO_BOOKMARKS_ENABLED, HOME_V4_ENABLED};
        }

        static {
            Flag[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
        }

        private Flag(String str, int i10, String str2) {
            super(str, i10);
            this.key = str2;
        }

        public static a getEntries() {
            return $ENTRIES;
        }

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) $VALUES.clone();
        }

        public final String getKey() {
            return this.key;
        }
    }

    static /* synthetic */ i isFlagEnabled$default(FeatureFlagService featureFlagService, Flag flag, boolean z6, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z6 = false;
            }
            if ((i10 & 4) != 0) {
                z10 = true;
            }
            return featureFlagService.isFlagEnabled(flag, z6, z10);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: isFlagEnabled");
        return null;
    }

    <T extends Enum<T>> i getVariant(Experiment<T> experiment);

    i isFlagEnabled(Flag flag, boolean defaultValue, boolean logUsage);
}

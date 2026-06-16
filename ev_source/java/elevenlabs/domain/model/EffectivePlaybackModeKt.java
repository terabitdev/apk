package io.elevenlabs.domain.model;

import com.google.protobuf.c6;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u001a\u0016\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"ORIGINAL_AUDIO", "", "effectivePlaybackMode", "Lio/elevenlabs/domain/model/EffectivePlaybackMode;", "readMeta", "Lio/elevenlabs/domain/model/ReadMeta;", "usedVoiceId", "resolveLastUsedVoiceId", "defaultVoiceId", "domain"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class EffectivePlaybackModeKt {
    public static final String ORIGINAL_AUDIO = "original_audio";

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioType.values().length];
            try {
                iArr[AudioType.MEDIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioType.TTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final EffectivePlaybackMode effectivePlaybackMode(ReadMeta readMeta, String str) {
        readMeta.getClass();
        if (!ReadMetaKt.isMediaType(readMeta)) {
            return EffectivePlaybackMode.Tts;
        }
        if (readMeta.getLastUsedAudioType() == AudioType.MEDIA) {
            return EffectivePlaybackMode.Audio;
        }
        if (str != null && !n.m0(str) && !m.c(str, ORIGINAL_AUDIO) && ReadMetaKt.getSupportsVoiceChanger(readMeta)) {
            return EffectivePlaybackMode.Tts;
        }
        return EffectivePlaybackMode.Audio;
    }

    public static final String resolveLastUsedVoiceId(ReadMeta readMeta, String str) {
        int i10;
        readMeta.getClass();
        str.getClass();
        AudioType lastUsedAudioType = readMeta.getLastUsedAudioType();
        if (lastUsedAudioType == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[lastUsedAudioType.ordinal()];
        }
        if (i10 != -1) {
            if (i10 == 1) {
                return ORIGINAL_AUDIO;
            }
            if (i10 == 2) {
                String lastUsedVoiceId = readMeta.getLastUsedVoiceId();
                if (lastUsedVoiceId != null) {
                    return lastUsedVoiceId;
                }
            } else {
                c6.p();
                return null;
            }
        } else {
            String lastUsedVoiceId2 = readMeta.getLastUsedVoiceId();
            if (lastUsedVoiceId2 == null) {
                if (ReadMetaKt.isMediaType(readMeta)) {
                    return ORIGINAL_AUDIO;
                }
            } else {
                return lastUsedVoiceId2;
            }
        }
        return str;
    }
}

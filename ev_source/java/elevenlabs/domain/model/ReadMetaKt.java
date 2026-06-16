package io.elevenlabs.domain.model;

import com.google.protobuf.c6;
import io.elevenlabs.domain.Analytics;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import t2.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\n\u0010\u0015\u001a\u00020\u0016*\u00020\b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006\"\u0015\u0010\u000b\u001a\u00020\f*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0015\u0010\u000f\u001a\u00020\u0010*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011\"\u0015\u0010\u0012\u001a\u00020\u0010*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011\"\u0015\u0010\u0013\u001a\u00020\u0010*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\"\u0015\u0010\u0014\u001a\u00020\u0010*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011\"\u0015\u0010\u0017\u001a\u00020\u0010*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0011\"\u0015\u0010\u0019\u001a\u00020\u0010*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011\"\u0015\u0010\u001b\u001a\u00020\u0010*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011\"\u0015\u0010\u001d\u001a\u00020\u0010*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011\"\u0015\u0010\u001f\u001a\u00020\u0010*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011¨\u0006 "}, d2 = {"analyticsValue", "", "Lio/elevenlabs/domain/model/AudioType;", "getAnalyticsValue", "(Lio/elevenlabs/domain/model/AudioType;)Ljava/lang/String;", "Lio/elevenlabs/domain/model/PlaybackSource;", "(Lio/elevenlabs/domain/model/PlaybackSource;)Ljava/lang/String;", "coverImageUrl", "Lio/elevenlabs/domain/model/ReadMeta;", "size", "Lio/elevenlabs/domain/model/CoverImageSize;", "resolvedCoverAspectRatio", "", "getResolvedCoverAspectRatio", "(Lio/elevenlabs/domain/model/ReadMeta;)F", "isAtEnd", "", "(Lio/elevenlabs/domain/model/ReadMeta;)Z", "isAvailableOffline", "isConverted", "isMediaType", "bookmarkType", "Lio/elevenlabs/domain/Analytics$Event$BookmarksSavedBookmark$BookmarkType;", "canShare", "getCanShare", "canShareAudio", "getCanShareAudio", "shouldShowOriginalAudio", "getShouldShowOriginalAudio", "supportsVoiceChanger", "getSupportsVoiceChanger", "isVoiceSelectionRestricted", "domain"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadMetaKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AudioType.values().length];
            try {
                iArr[AudioType.TTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioType.MEDIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PlaybackSource.values().length];
            try {
                iArr2[PlaybackSource.ONLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PlaybackSource.OFFLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Analytics.Event.BookmarksSavedBookmark.BookmarkType bookmarkType(ReadMeta readMeta) {
        readMeta.getClass();
        if (isMediaType(readMeta)) {
            return Analytics.Event.BookmarksSavedBookmark.BookmarkType.Media;
        }
        return Analytics.Event.BookmarksSavedBookmark.BookmarkType.Tts;
    }

    public static final String coverImageUrl(ReadMeta readMeta, CoverImageSize coverImageSize) {
        String str;
        readMeta.getClass();
        coverImageSize.getClass();
        Map<String, String> coverImageUrls = readMeta.getCoverImageUrls();
        if (coverImageUrls != null && (str = coverImageUrls.get(coverImageSize.getKey())) != null) {
            return str;
        }
        return readMeta.getArticleImageUrl();
    }

    public static final String getAnalyticsValue(AudioType audioType) {
        audioType.getClass();
        int i10 = WhenMappings.$EnumSwitchMapping$0[audioType.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return "media";
            }
            c6.p();
            return null;
        }
        return "tts";
    }

    public static final boolean getCanShare(ReadMeta readMeta) {
        readMeta.getClass();
        return !readMeta.getFromUserImport();
    }

    public static final boolean getCanShareAudio(ReadMeta readMeta) {
        readMeta.getClass();
        if (getCanShare(readMeta) && readMeta.getSource() != ReadSource.Podcast && !isMediaType(readMeta)) {
            return true;
        }
        return false;
    }

    public static final float getResolvedCoverAspectRatio(ReadMeta readMeta) {
        readMeta.getClass();
        Double coverAspectRatio = readMeta.getCoverAspectRatio();
        if (coverAspectRatio != null) {
            Float valueOf = Float.valueOf((float) coverAspectRatio.doubleValue());
            float floatValue = valueOf.floatValue();
            if (Math.abs(floatValue) > Float.MAX_VALUE || floatValue <= u.P) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.floatValue();
            }
        }
        if (readMeta.isBookType()) {
            return 0.6666667f;
        }
        return 1.0f;
    }

    public static final boolean getShouldShowOriginalAudio(ReadMeta readMeta) {
        readMeta.getClass();
        if (!readMeta.getHasOriginalAudio() && !isMediaType(readMeta) && readMeta.getSource() != ReadSource.Podcast) {
            return false;
        }
        return true;
    }

    public static final boolean getSupportsVoiceChanger(ReadMeta readMeta) {
        readMeta.getClass();
        if (isMediaType(readMeta) && readMeta.isVoiceChangerOn() && readMeta.getAudioTypes().contains(AudioType.TTS)) {
            return true;
        }
        return false;
    }

    public static final boolean isAtEnd(ReadMeta readMeta) {
        readMeta.getClass();
        if (isMediaType(readMeta)) {
            Double totalAudioDurationSeconds = ReadMetaExtensionsKt.getTotalAudioDurationSeconds(readMeta);
            if (totalAudioDurationSeconds != null) {
                double doubleValue = totalAudioDurationSeconds.doubleValue();
                Double audioElapsedSeconds = ReadMetaExtensionsKt.getAudioElapsedSeconds(readMeta);
                if (audioElapsedSeconds != null) {
                    double doubleValue2 = audioElapsedSeconds.doubleValue();
                    if (doubleValue2 > 0.0d && doubleValue2 >= doubleValue - 10.0d) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (readMeta.getLastListenedCharOffset() > 0 && readMeta.getLastListenedCharOffset() >= readMeta.getCharCount() - 50) {
            return true;
        }
        return false;
    }

    public static final boolean isAvailableOffline(ReadMeta readMeta) {
        OfflineReadStatus offlineReadStatus;
        readMeta.getClass();
        OfflineReadData offlineReadData = readMeta.getOfflineReadData();
        if (offlineReadData != null) {
            offlineReadStatus = offlineReadData.getStatus();
        } else {
            offlineReadStatus = null;
        }
        if (offlineReadStatus == OfflineReadStatus.READY) {
            return true;
        }
        return false;
    }

    public static final boolean isConverted(ReadMeta readMeta) {
        readMeta.getClass();
        if (readMeta.getCreationStatus() != null && readMeta.getCreationStatus() != ReadCreationStatus.Finished) {
            return false;
        }
        return true;
    }

    public static final boolean isMediaType(ReadMeta readMeta) {
        readMeta.getClass();
        if (readMeta.getAudioType() == AudioType.MEDIA) {
            return true;
        }
        return false;
    }

    public static final boolean isVoiceSelectionRestricted(ReadMeta readMeta) {
        readMeta.getClass();
        if (readMeta.getVoiceSelectionConfig() != VoiceSelectionConfig.PreSelectedOnly && !isMediaType(readMeta) && readMeta.getSource() != ReadSource.Podcast) {
            return false;
        }
        return true;
    }

    public static final String getAnalyticsValue(PlaybackSource playbackSource) {
        playbackSource.getClass();
        int i10 = WhenMappings.$EnumSwitchMapping$1[playbackSource.ordinal()];
        if (i10 == 1) {
            return "online";
        }
        if (i10 == 2) {
            return "offline";
        }
        c6.p();
        return null;
    }
}

package io.elevenlabs.player;

import android.os.Bundle;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.ReadSource;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import t2.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\",\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\",\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\",\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\",\u0010\u0014\u001a\u0004\u0018\u00010\u000e*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013\",\u0010\u0017\u001a\u0004\u0018\u00010\u000e*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013\",\u0010\u001a\u001a\u0004\u0018\u00010\u000e*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013\",\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\",\u0010$\u001a\u0004\u0018\u00010#*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(\",\u0010)\u001a\u0004\u0018\u00010\u000e*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010\u0013\",\u0010,\u001a\u0004\u0018\u00010\u0001*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0005\"\u0004\b.\u0010\u0007\",\u00100\u001a\u0004\u0018\u00010/*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104\",\u00106\u001a\u0004\u0018\u000105*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u0001058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:\",\u0010;\u001a\u0004\u0018\u00010\u0001*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010\u0005\"\u0004\b=\u0010\u0007¨\u0006>"}, d2 = {"value", "", "initialOffset", "Landroid/os/Bundle;", "getInitialOffset", "(Landroid/os/Bundle;)Ljava/lang/Long;", "setInitialOffset", "(Landroid/os/Bundle;Ljava/lang/Long;)V", "", "audioSeekPosition", "getAudioSeekPosition", "(Landroid/os/Bundle;)Ljava/lang/Double;", "setAudioSeekPosition", "(Landroid/os/Bundle;Ljava/lang/Double;)V", "", "audioFileNumber", "getAudioFileNumber", "(Landroid/os/Bundle;)Ljava/lang/String;", "setAudioFileNumber", "(Landroid/os/Bundle;Ljava/lang/String;)V", "voiceId", "getVoiceId", "setVoiceId", "soundscapeId", "getSoundscapeId", "setSoundscapeId", "soundscapeFile", "getSoundscapeFile", "setSoundscapeFile", "", "soundscapeMixingLevel", "getSoundscapeMixingLevel", "(Landroid/os/Bundle;)Ljava/lang/Float;", "setSoundscapeMixingLevel", "(Landroid/os/Bundle;Ljava/lang/Float;)V", "Lio/elevenlabs/domain/model/ReadSource;", "readSource", "getReadSource", "(Landroid/os/Bundle;)Lio/elevenlabs/domain/model/ReadSource;", "setReadSource", "(Landroid/os/Bundle;Lio/elevenlabs/domain/model/ReadSource;)V", "originalFileType", "getOriginalFileType", "setOriginalFileType", "sleepTimerTimestamp", "getSleepTimerTimestamp", "setSleepTimerTimestamp", "Lio/elevenlabs/domain/Analytics$Event$PlayerControlEventSource;", "seekSource", "getSeekSource", "(Landroid/os/Bundle;)Lio/elevenlabs/domain/Analytics$Event$PlayerControlEventSource;", "setSeekSource", "(Landroid/os/Bundle;Lio/elevenlabs/domain/Analytics$Event$PlayerControlEventSource;)V", "", "seekDurationSeconds", "getSeekDurationSeconds", "(Landroid/os/Bundle;)Ljava/lang/Integer;", "setSeekDurationSeconds", "(Landroid/os/Bundle;Ljava/lang/Integer;)V", "seekCharacterOffset", "getSeekCharacterOffset", "setSeekCharacterOffset", "player_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ExchangeKt {
    public static final String getAudioFileNumber(Bundle bundle) {
        bundle.getClass();
        return bundle.getString("audioFileNumber");
    }

    public static final Double getAudioSeekPosition(Bundle bundle) {
        bundle.getClass();
        Double valueOf = Double.valueOf(bundle.getDouble("audioSeekPosition", -1.0d));
        if (valueOf.doubleValue() >= 0.0d) {
            return valueOf;
        }
        return null;
    }

    public static final Long getInitialOffset(Bundle bundle) {
        bundle.getClass();
        Long valueOf = Long.valueOf(bundle.getLong("initialOffset", -1L));
        if (valueOf.longValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final String getOriginalFileType(Bundle bundle) {
        bundle.getClass();
        return bundle.getString("originalFileType");
    }

    public static final ReadSource getReadSource(Bundle bundle) {
        bundle.getClass();
        String string = bundle.getString("readSource");
        Object obj = null;
        if (string == null) {
            return null;
        }
        Iterator<E> it = ReadSource.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (m.c(((ReadSource) next).getValue(), string)) {
                obj = next;
                break;
            }
        }
        return (ReadSource) obj;
    }

    public static final Long getSeekCharacterOffset(Bundle bundle) {
        bundle.getClass();
        Long valueOf = Long.valueOf(bundle.getLong("seekCharacterOffset", -1L));
        if (valueOf.longValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final Integer getSeekDurationSeconds(Bundle bundle) {
        bundle.getClass();
        Integer valueOf = Integer.valueOf(bundle.getInt("seekDurationSeconds", -1));
        if (valueOf.intValue() > 0) {
            return valueOf;
        }
        return null;
    }

    public static final Analytics.Event.PlayerControlEventSource getSeekSource(Bundle bundle) {
        bundle.getClass();
        String string = bundle.getString("seekSource");
        Object obj = null;
        if (string == null) {
            return null;
        }
        Iterator<E> it = Analytics.Event.PlayerControlEventSource.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (m.c(((Analytics.Event.PlayerControlEventSource) next).getValue(), string)) {
                obj = next;
                break;
            }
        }
        return (Analytics.Event.PlayerControlEventSource) obj;
    }

    public static final Long getSleepTimerTimestamp(Bundle bundle) {
        bundle.getClass();
        Long valueOf = Long.valueOf(bundle.getLong("sleepTimerTimestamp", -1L));
        if (valueOf.longValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final String getSoundscapeFile(Bundle bundle) {
        bundle.getClass();
        return bundle.getString("soundscapeFile");
    }

    public static final String getSoundscapeId(Bundle bundle) {
        bundle.getClass();
        return bundle.getString("soundscapeId");
    }

    public static final Float getSoundscapeMixingLevel(Bundle bundle) {
        bundle.getClass();
        Float valueOf = Float.valueOf(bundle.getFloat("soundscapeMixingLevel", -1.0f));
        if (valueOf.floatValue() >= u.P) {
            return valueOf;
        }
        return null;
    }

    public static final String getVoiceId(Bundle bundle) {
        bundle.getClass();
        return bundle.getString("voiceId");
    }

    public static final void setAudioFileNumber(Bundle bundle, String str) {
        bundle.getClass();
        if (str != null) {
            bundle.putString("audioFileNumber", str);
        } else {
            bundle.remove("audioFileNumber");
        }
    }

    public static final void setAudioSeekPosition(Bundle bundle, Double d10) {
        bundle.getClass();
        if (d10 != null) {
            bundle.putDouble("audioSeekPosition", d10.doubleValue());
        } else {
            bundle.remove("audioSeekPosition");
        }
    }

    public static final void setInitialOffset(Bundle bundle, Long l4) {
        bundle.getClass();
        if (l4 != null) {
            bundle.putLong("initialOffset", l4.longValue());
        } else {
            bundle.remove("initialOffset");
        }
    }

    public static final void setOriginalFileType(Bundle bundle, String str) {
        bundle.getClass();
        if (str != null) {
            bundle.putString("originalFileType", str);
        } else {
            bundle.remove("originalFileType");
        }
    }

    public static final void setReadSource(Bundle bundle, ReadSource readSource) {
        bundle.getClass();
        if (readSource != null) {
            bundle.putString("readSource", readSource.getValue());
        } else {
            bundle.remove("readSource");
        }
    }

    public static final void setSeekCharacterOffset(Bundle bundle, Long l4) {
        bundle.getClass();
        if (l4 != null && l4.longValue() >= 0) {
            bundle.putLong("seekCharacterOffset", l4.longValue());
        } else {
            bundle.remove("seekCharacterOffset");
        }
    }

    public static final void setSeekDurationSeconds(Bundle bundle, Integer num) {
        bundle.getClass();
        if (num != null && num.intValue() > 0) {
            bundle.putInt("seekDurationSeconds", num.intValue());
        } else {
            bundle.remove("seekDurationSeconds");
        }
    }

    public static final void setSeekSource(Bundle bundle, Analytics.Event.PlayerControlEventSource playerControlEventSource) {
        bundle.getClass();
        if (playerControlEventSource != null) {
            bundle.putString("seekSource", playerControlEventSource.getValue());
        } else {
            bundle.remove("seekSource");
        }
    }

    public static final void setSleepTimerTimestamp(Bundle bundle, Long l4) {
        bundle.getClass();
        if (l4 != null) {
            bundle.putLong("sleepTimerTimestamp", l4.longValue());
        } else {
            bundle.remove("sleepTimerTimestamp");
        }
    }

    public static final void setSoundscapeFile(Bundle bundle, String str) {
        bundle.getClass();
        if (str != null) {
            bundle.putString("soundscapeFile", str);
        } else {
            bundle.remove("soundscapeFile");
        }
    }

    public static final void setSoundscapeId(Bundle bundle, String str) {
        bundle.getClass();
        if (str != null) {
            bundle.putString("soundscapeId", str);
        } else {
            bundle.remove("soundscapeId");
        }
    }

    public static final void setSoundscapeMixingLevel(Bundle bundle, Float f10) {
        bundle.getClass();
        if (f10 != null) {
            bundle.putFloat("soundscapeMixingLevel", f10.floatValue());
        } else {
            bundle.remove("soundscapeMixingLevel");
        }
    }

    public static final void setVoiceId(Bundle bundle, String str) {
        bundle.getClass();
        if (str != null) {
            bundle.putString("voiceId", str);
        } else {
            bundle.remove("voiceId");
        }
    }
}

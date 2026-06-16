package io.elevenlabs.player;

import android.gov.nist.core.Separators;
import java.io.File;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lio/elevenlabs/player/BackgroundPlayerAction;", "", "SleepTimer", "SeekBack", "SeekForward", "SeekToOffset", "SetSoundscape", "NextChapter", "PreviousChapter", "Bookmark", "VoiceChat", "Lio/elevenlabs/player/BackgroundPlayerAction$Bookmark;", "Lio/elevenlabs/player/BackgroundPlayerAction$NextChapter;", "Lio/elevenlabs/player/BackgroundPlayerAction$PreviousChapter;", "Lio/elevenlabs/player/BackgroundPlayerAction$SeekBack;", "Lio/elevenlabs/player/BackgroundPlayerAction$SeekForward;", "Lio/elevenlabs/player/BackgroundPlayerAction$SeekToOffset;", "Lio/elevenlabs/player/BackgroundPlayerAction$SetSoundscape;", "Lio/elevenlabs/player/BackgroundPlayerAction$SleepTimer;", "Lio/elevenlabs/player/BackgroundPlayerAction$VoiceChat;", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface BackgroundPlayerAction {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0083\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010\f\u001a\u00020\u0005HÖ\u0081\u0004R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/elevenlabs/player/BackgroundPlayerAction$Bookmark;", "Lio/elevenlabs/player/BackgroundPlayerAction;", "<init>", "()V", "ACTION_ID", "", "equals", "", "other", "", "hashCode", "", "toString", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Bookmark implements BackgroundPlayerAction {
        public static final String ACTION_ID = "bookmark";
        public static final Bookmark INSTANCE = new Bookmark();

        private Bookmark() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof Bookmark)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -164276239;
        }

        public String toString() {
            return "Bookmark";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0083\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010\f\u001a\u00020\u0005HÖ\u0081\u0004R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/elevenlabs/player/BackgroundPlayerAction$NextChapter;", "Lio/elevenlabs/player/BackgroundPlayerAction;", "<init>", "()V", "ACTION_ID", "", "equals", "", "other", "", "hashCode", "", "toString", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class NextChapter implements BackgroundPlayerAction {
        public static final String ACTION_ID = "next_chapter";
        public static final NextChapter INSTANCE = new NextChapter();

        private NextChapter() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof NextChapter)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 873591103;
        }

        public String toString() {
            return "NextChapter";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0083\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010\f\u001a\u00020\u0005HÖ\u0081\u0004R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/elevenlabs/player/BackgroundPlayerAction$PreviousChapter;", "Lio/elevenlabs/player/BackgroundPlayerAction;", "<init>", "()V", "ACTION_ID", "", "equals", "", "other", "", "hashCode", "", "toString", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class PreviousChapter implements BackgroundPlayerAction {
        public static final String ACTION_ID = "previous_chapter";
        public static final PreviousChapter INSTANCE = new PreviousChapter();

        private PreviousChapter() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof PreviousChapter)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 202390075;
        }

        public String toString() {
            return "PreviousChapter";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0083\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010\f\u001a\u00020\u0005HÖ\u0081\u0004R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/elevenlabs/player/BackgroundPlayerAction$SeekBack;", "Lio/elevenlabs/player/BackgroundPlayerAction;", "<init>", "()V", "ACTION_ID", "", "equals", "", "other", "", "hashCode", "", "toString", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class SeekBack implements BackgroundPlayerAction {
        public static final String ACTION_ID = "seek_back";
        public static final SeekBack INSTANCE = new SeekBack();

        private SeekBack() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof SeekBack)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1173946822;
        }

        public String toString() {
            return "SeekBack";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0083\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010\f\u001a\u00020\u0005HÖ\u0081\u0004R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/elevenlabs/player/BackgroundPlayerAction$SeekForward;", "Lio/elevenlabs/player/BackgroundPlayerAction;", "<init>", "()V", "ACTION_ID", "", "equals", "", "other", "", "hashCode", "", "toString", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class SeekForward implements BackgroundPlayerAction {
        public static final String ACTION_ID = "seek_forward";
        public static final SeekForward INSTANCE = new SeekForward();

        private SeekForward() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof SeekForward)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 539079826;
        }

        public String toString() {
            return "SeekForward";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0083\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010\f\u001a\u00020\u0005HÖ\u0081\u0004R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/elevenlabs/player/BackgroundPlayerAction$SeekToOffset;", "Lio/elevenlabs/player/BackgroundPlayerAction;", "<init>", "()V", "ACTION_ID", "", "equals", "", "other", "", "hashCode", "", "toString", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class SeekToOffset implements BackgroundPlayerAction {
        public static final String ACTION_ID = "seek_to_offset";
        public static final SeekToOffset INSTANCE = new SeekToOffset();

        private SeekToOffset() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof SeekToOffset)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1438543553;
        }

        public String toString() {
            return "SeekToOffset";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/player/BackgroundPlayerAction$SetSoundscape;", "Lio/elevenlabs/player/BackgroundPlayerAction;", "soundscapeId", "", "file", "Ljava/io/File;", "mixingLevel", "", "<init>", "(Ljava/lang/String;Ljava/io/File;F)V", "getSoundscapeId", "()Ljava/lang/String;", "getFile", "()Ljava/io/File;", "getMixingLevel", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class SetSoundscape implements BackgroundPlayerAction {
        public static final String ACTION_ID = "set_soundscape";
        private final File file;
        private final float mixingLevel;
        private final String soundscapeId;

        public SetSoundscape(String str, File file, float f10) {
            this.soundscapeId = str;
            this.file = file;
            this.mixingLevel = f10;
        }

        public static /* synthetic */ SetSoundscape copy$default(SetSoundscape setSoundscape, String str, File file, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = setSoundscape.soundscapeId;
            }
            if ((i10 & 2) != 0) {
                file = setSoundscape.file;
            }
            if ((i10 & 4) != 0) {
                f10 = setSoundscape.mixingLevel;
            }
            return setSoundscape.copy(str, file, f10);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSoundscapeId() {
            return this.soundscapeId;
        }

        /* renamed from: component2, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        /* renamed from: component3, reason: from getter */
        public final float getMixingLevel() {
            return this.mixingLevel;
        }

        public final SetSoundscape copy(String soundscapeId, File file, float mixingLevel) {
            return new SetSoundscape(soundscapeId, file, mixingLevel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetSoundscape)) {
                return false;
            }
            SetSoundscape setSoundscape = (SetSoundscape) other;
            if (m.c(this.soundscapeId, setSoundscape.soundscapeId) && m.c(this.file, setSoundscape.file) && Float.compare(this.mixingLevel, setSoundscape.mixingLevel) == 0) {
                return true;
            }
            return false;
        }

        public final File getFile() {
            return this.file;
        }

        public final float getMixingLevel() {
            return this.mixingLevel;
        }

        public final String getSoundscapeId() {
            return this.soundscapeId;
        }

        public int hashCode() {
            int hashCode;
            String str = this.soundscapeId;
            int i10 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = hashCode * 31;
            File file = this.file;
            if (file != null) {
                i10 = file.hashCode();
            }
            return Float.hashCode(this.mixingLevel) + ((i11 + i10) * 31);
        }

        public String toString() {
            return "SetSoundscape(soundscapeId=" + this.soundscapeId + ", file=" + this.file + ", mixingLevel=" + this.mixingLevel + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/player/BackgroundPlayerAction$SleepTimer;", "Lio/elevenlabs/player/BackgroundPlayerAction;", "date", "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getDate", "()Ljava/util/Date;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class SleepTimer implements BackgroundPlayerAction {
        public static final String ACTION_ID = "sleep_timer";
        private final Date date;

        public SleepTimer(Date date) {
            this.date = date;
        }

        public static /* synthetic */ SleepTimer copy$default(SleepTimer sleepTimer, Date date, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                date = sleepTimer.date;
            }
            return sleepTimer.copy(date);
        }

        /* renamed from: component1, reason: from getter */
        public final Date getDate() {
            return this.date;
        }

        public final SleepTimer copy(Date date) {
            return new SleepTimer(date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof SleepTimer) && m.c(this.date, ((SleepTimer) other).date)) {
                return true;
            }
            return false;
        }

        public final Date getDate() {
            return this.date;
        }

        public int hashCode() {
            Date date = this.date;
            if (date == null) {
                return 0;
            }
            return date.hashCode();
        }

        public String toString() {
            return "SleepTimer(date=" + this.date + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0083\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010\f\u001a\u00020\u0005HÖ\u0081\u0004R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/elevenlabs/player/BackgroundPlayerAction$VoiceChat;", "Lio/elevenlabs/player/BackgroundPlayerAction;", "<init>", "()V", "ACTION_ID", "", "equals", "", "other", "", "hashCode", "", "toString", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class VoiceChat implements BackgroundPlayerAction {
        public static final String ACTION_ID = "voice_chat";
        public static final VoiceChat INSTANCE = new VoiceChat();

        private VoiceChat() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof VoiceChat)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 440640591;
        }

        public String toString() {
            return "VoiceChat";
        }
    }
}

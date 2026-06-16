package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import ib.i;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001%BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lio/elevenlabs/domain/model/Soundscape;", "", "id", "", DiagnosticsEntry.NAME_KEY, "category", "mp3Url", "mp3Checksum", "iconUrl", "audioFiles", "", "Lio/elevenlabs/domain/model/Soundscape$AudioFile;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getName", "getCategory", "getMp3Url", "getMp3Checksum", "getIconUrl", "getAudioFiles", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "AudioFile", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class Soundscape {
    private final List<AudioFile> audioFiles;
    private final String category;
    private final String iconUrl;
    private final String id;
    private final String mp3Checksum;
    private final String mp3Url;
    private final String name;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/model/Soundscape$AudioFile;", "", "remoteUrl", "", "checksum", "fileExtension", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRemoteUrl", "()Ljava/lang/String;", "getChecksum", "getFileExtension", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class AudioFile {
        private final String checksum;
        private final String fileExtension;
        private final String remoteUrl;

        public AudioFile(String str, String str2, String str3) {
            i.s(str, str2, str3);
            this.remoteUrl = str;
            this.checksum = str2;
            this.fileExtension = str3;
        }

        public static /* synthetic */ AudioFile copy$default(AudioFile audioFile, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = audioFile.remoteUrl;
            }
            if ((i10 & 2) != 0) {
                str2 = audioFile.checksum;
            }
            if ((i10 & 4) != 0) {
                str3 = audioFile.fileExtension;
            }
            return audioFile.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRemoteUrl() {
            return this.remoteUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final String getChecksum() {
            return this.checksum;
        }

        /* renamed from: component3, reason: from getter */
        public final String getFileExtension() {
            return this.fileExtension;
        }

        public final AudioFile copy(String remoteUrl, String checksum, String fileExtension) {
            remoteUrl.getClass();
            checksum.getClass();
            fileExtension.getClass();
            return new AudioFile(remoteUrl, checksum, fileExtension);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioFile)) {
                return false;
            }
            AudioFile audioFile = (AudioFile) other;
            if (m.c(this.remoteUrl, audioFile.remoteUrl) && m.c(this.checksum, audioFile.checksum) && m.c(this.fileExtension, audioFile.fileExtension)) {
                return true;
            }
            return false;
        }

        public final String getChecksum() {
            return this.checksum;
        }

        public final String getFileExtension() {
            return this.fileExtension;
        }

        public final String getRemoteUrl() {
            return this.remoteUrl;
        }

        public int hashCode() {
            return this.fileExtension.hashCode() + c.c(this.remoteUrl.hashCode() * 31, 31, this.checksum);
        }

        public String toString() {
            return f.l(this.fileExtension, Separators.RPAREN, f.s("AudioFile(remoteUrl=", this.remoteUrl, ", checksum=", this.checksum, ", fileExtension="));
        }
    }

    public Soundscape(String str, String str2, String str3, String str4, String str5, String str6, List<AudioFile> list) {
        c.v(str, str2, str3, str4, str5);
        this.id = str;
        this.name = str2;
        this.category = str3;
        this.mp3Url = str4;
        this.mp3Checksum = str5;
        this.iconUrl = str6;
        this.audioFiles = list;
    }

    public static /* synthetic */ Soundscape copy$default(Soundscape soundscape, String str, String str2, String str3, String str4, String str5, String str6, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = soundscape.id;
        }
        if ((i10 & 2) != 0) {
            str2 = soundscape.name;
        }
        if ((i10 & 4) != 0) {
            str3 = soundscape.category;
        }
        if ((i10 & 8) != 0) {
            str4 = soundscape.mp3Url;
        }
        if ((i10 & 16) != 0) {
            str5 = soundscape.mp3Checksum;
        }
        if ((i10 & 32) != 0) {
            str6 = soundscape.iconUrl;
        }
        if ((i10 & 64) != 0) {
            list = soundscape.audioFiles;
        }
        String str7 = str6;
        List list2 = list;
        String str8 = str5;
        String str9 = str3;
        return soundscape.copy(str, str2, str9, str4, str8, str7, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMp3Url() {
        return this.mp3Url;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMp3Checksum() {
        return this.mp3Checksum;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final List<AudioFile> component7() {
        return this.audioFiles;
    }

    public final Soundscape copy(String id2, String name, String category, String mp3Url, String mp3Checksum, String iconUrl, List<AudioFile> audioFiles) {
        id2.getClass();
        name.getClass();
        category.getClass();
        mp3Url.getClass();
        mp3Checksum.getClass();
        return new Soundscape(id2, name, category, mp3Url, mp3Checksum, iconUrl, audioFiles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Soundscape)) {
            return false;
        }
        Soundscape soundscape = (Soundscape) other;
        if (m.c(this.id, soundscape.id) && m.c(this.name, soundscape.name) && m.c(this.category, soundscape.category) && m.c(this.mp3Url, soundscape.mp3Url) && m.c(this.mp3Checksum, soundscape.mp3Checksum) && m.c(this.iconUrl, soundscape.iconUrl) && m.c(this.audioFiles, soundscape.audioFiles)) {
            return true;
        }
        return false;
    }

    public final List<AudioFile> getAudioFiles() {
        return this.audioFiles;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMp3Checksum() {
        return this.mp3Checksum;
    }

    public final String getMp3Url() {
        return this.mp3Url;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode;
        int c5 = c.c(c.c(c.c(c.c(this.id.hashCode() * 31, 31, this.name), 31, this.category), 31, this.mp3Url), 31, this.mp3Checksum);
        String str = this.iconUrl;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        List<AudioFile> list = this.audioFiles;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.category;
        String str4 = this.mp3Url;
        String str5 = this.mp3Checksum;
        String str6 = this.iconUrl;
        List<AudioFile> list = this.audioFiles;
        StringBuilder s10 = f.s("Soundscape(id=", str, ", name=", str2, ", category=");
        f.x(s10, str3, ", mp3Url=", str4, ", mp3Checksum=");
        f.x(s10, str5, ", iconUrl=", str6, ", audioFiles=");
        return h.e(s10, list, Separators.RPAREN);
    }
}

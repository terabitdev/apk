package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lio/elevenlabs/domain/model/Intro;", "", "bookPreview", "Lio/elevenlabs/domain/model/BookPreviewIntro;", "voicePreview", "Lio/elevenlabs/domain/model/VoicePreviewIntro;", "podcastPreview", "Lio/elevenlabs/domain/model/PodcastPreviewIntro;", "streaks", "Lio/elevenlabs/domain/model/StreaksIntro;", "<init>", "(Lio/elevenlabs/domain/model/BookPreviewIntro;Lio/elevenlabs/domain/model/VoicePreviewIntro;Lio/elevenlabs/domain/model/PodcastPreviewIntro;Lio/elevenlabs/domain/model/StreaksIntro;)V", "getBookPreview", "()Lio/elevenlabs/domain/model/BookPreviewIntro;", "getVoicePreview", "()Lio/elevenlabs/domain/model/VoicePreviewIntro;", "getPodcastPreview", "()Lio/elevenlabs/domain/model/PodcastPreviewIntro;", "getStreaks", "()Lio/elevenlabs/domain/model/StreaksIntro;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class Intro {
    private final BookPreviewIntro bookPreview;
    private final PodcastPreviewIntro podcastPreview;
    private final StreaksIntro streaks;
    private final VoicePreviewIntro voicePreview;

    public Intro(BookPreviewIntro bookPreviewIntro, VoicePreviewIntro voicePreviewIntro, PodcastPreviewIntro podcastPreviewIntro, StreaksIntro streaksIntro) {
        bookPreviewIntro.getClass();
        voicePreviewIntro.getClass();
        podcastPreviewIntro.getClass();
        streaksIntro.getClass();
        this.bookPreview = bookPreviewIntro;
        this.voicePreview = voicePreviewIntro;
        this.podcastPreview = podcastPreviewIntro;
        this.streaks = streaksIntro;
    }

    public static /* synthetic */ Intro copy$default(Intro intro, BookPreviewIntro bookPreviewIntro, VoicePreviewIntro voicePreviewIntro, PodcastPreviewIntro podcastPreviewIntro, StreaksIntro streaksIntro, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bookPreviewIntro = intro.bookPreview;
        }
        if ((i10 & 2) != 0) {
            voicePreviewIntro = intro.voicePreview;
        }
        if ((i10 & 4) != 0) {
            podcastPreviewIntro = intro.podcastPreview;
        }
        if ((i10 & 8) != 0) {
            streaksIntro = intro.streaks;
        }
        return intro.copy(bookPreviewIntro, voicePreviewIntro, podcastPreviewIntro, streaksIntro);
    }

    /* renamed from: component1, reason: from getter */
    public final BookPreviewIntro getBookPreview() {
        return this.bookPreview;
    }

    /* renamed from: component2, reason: from getter */
    public final VoicePreviewIntro getVoicePreview() {
        return this.voicePreview;
    }

    /* renamed from: component3, reason: from getter */
    public final PodcastPreviewIntro getPodcastPreview() {
        return this.podcastPreview;
    }

    /* renamed from: component4, reason: from getter */
    public final StreaksIntro getStreaks() {
        return this.streaks;
    }

    public final Intro copy(BookPreviewIntro bookPreview, VoicePreviewIntro voicePreview, PodcastPreviewIntro podcastPreview, StreaksIntro streaks) {
        bookPreview.getClass();
        voicePreview.getClass();
        podcastPreview.getClass();
        streaks.getClass();
        return new Intro(bookPreview, voicePreview, podcastPreview, streaks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Intro)) {
            return false;
        }
        Intro intro = (Intro) other;
        if (m.c(this.bookPreview, intro.bookPreview) && m.c(this.voicePreview, intro.voicePreview) && m.c(this.podcastPreview, intro.podcastPreview) && m.c(this.streaks, intro.streaks)) {
            return true;
        }
        return false;
    }

    public final BookPreviewIntro getBookPreview() {
        return this.bookPreview;
    }

    public final PodcastPreviewIntro getPodcastPreview() {
        return this.podcastPreview;
    }

    public final StreaksIntro getStreaks() {
        return this.streaks;
    }

    public final VoicePreviewIntro getVoicePreview() {
        return this.voicePreview;
    }

    public int hashCode() {
        return this.streaks.hashCode() + ((this.podcastPreview.hashCode() + ((this.voicePreview.hashCode() + (this.bookPreview.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Intro(bookPreview=" + this.bookPreview + ", voicePreview=" + this.voicePreview + ", podcastPreview=" + this.podcastPreview + ", streaks=" + this.streaks + Separators.RPAREN;
    }
}

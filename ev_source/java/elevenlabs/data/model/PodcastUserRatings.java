package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import tr.b;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0004-./,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u0019¨\u00060"}, d2 = {"Lio/elevenlabs/data/model/PodcastUserRatings;", "", "Lio/elevenlabs/data/model/PodcastUserRatings$Content;", FirebaseAnalytics.Param.CONTENT, "Lio/elevenlabs/data/model/PodcastUserRatings$Voice;", "voice", "<init>", "(Lio/elevenlabs/data/model/PodcastUserRatings$Content;Lio/elevenlabs/data/model/PodcastUserRatings$Voice;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILio/elevenlabs/data/model/PodcastUserRatings$Content;Lio/elevenlabs/data/model/PodcastUserRatings$Voice;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/PodcastUserRatings;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lio/elevenlabs/data/model/PodcastUserRatings$Content;", "component2", "()Lio/elevenlabs/data/model/PodcastUserRatings$Voice;", "copy", "(Lio/elevenlabs/data/model/PodcastUserRatings$Content;Lio/elevenlabs/data/model/PodcastUserRatings$Voice;)Lio/elevenlabs/data/model/PodcastUserRatings;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/elevenlabs/data/model/PodcastUserRatings$Content;", "getContent", "getContent$annotations", "()V", "Lio/elevenlabs/data/model/PodcastUserRatings$Voice;", "getVoice", "getVoice$annotations", "Companion", "Content", "Voice", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class PodcastUserRatings {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Content content;
    private final Voice voice;

    static {
        io.elevenlabs.data.database.entities.reads.a aVar = new io.elevenlabs.data.database.entities.reads.a(14);
        i iVar = i.f31597b;
        $childSerializers = new h[]{sn.a.d(iVar, aVar), sn.a.d(iVar, new io.elevenlabs.data.database.entities.reads.a(15))};
    }

    public /* synthetic */ PodcastUserRatings(int i10, Content content, Voice voice, c1 c1Var) {
        if (3 == (i10 & 3)) {
            this.content = content;
            this.voice = voice;
        } else {
            t0.j(i10, 3, PodcastUserRatings$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Content.INSTANCE.serializer();
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return Voice.INSTANCE.serializer();
    }

    public static /* synthetic */ PodcastUserRatings copy$default(PodcastUserRatings podcastUserRatings, Content content, Voice voice, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            content = podcastUserRatings.content;
        }
        if ((i10 & 2) != 0) {
            voice = podcastUserRatings.voice;
        }
        return podcastUserRatings.copy(content, voice);
    }

    public static final /* synthetic */ void write$Self$data_release(PodcastUserRatings self, b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.g(serialDesc, 0, (KSerializer) hVarArr[0].getValue(), self.content);
        output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.voice);
    }

    /* renamed from: component1, reason: from getter */
    public final Content getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final Voice getVoice() {
        return this.voice;
    }

    public final PodcastUserRatings copy(Content r22, Voice voice) {
        r22.getClass();
        voice.getClass();
        return new PodcastUserRatings(r22, voice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PodcastUserRatings)) {
            return false;
        }
        PodcastUserRatings podcastUserRatings = (PodcastUserRatings) other;
        if (this.content == podcastUserRatings.content && this.voice == podcastUserRatings.voice) {
            return true;
        }
        return false;
    }

    public final Content getContent() {
        return this.content;
    }

    public final Voice getVoice() {
        return this.voice;
    }

    public int hashCode() {
        return this.voice.hashCode() + (this.content.hashCode() * 31);
    }

    public String toString() {
        return "PodcastUserRatings(content=" + this.content + ", voice=" + this.voice + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lio/elevenlabs/data/model/PodcastUserRatings$Content;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "THUMBS_UP", "THUMBS_DOWN", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public static final class Content extends Enum<Content> {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ Content[] $VALUES;
        private static final h $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;
        public static final Content THUMBS_UP = new Content("THUMBS_UP", 0, "thumbs_up");
        public static final Content THUMBS_DOWN = new Content("THUMBS_DOWN", 1, "thumbs_down");

        private static final /* synthetic */ Content[] $values() {
            return new Content[]{THUMBS_UP, THUMBS_DOWN};
        }

        static {
            Content[] $values = $values();
            $VALUES = $values;
            $ENTRIES = rd.c1.q($values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = sn.a.d(i.f31597b, new io.elevenlabs.data.database.entities.reads.a(16));
        }

        private Content(String str, int i10, String str2) {
            super(str, i10);
            this.value = str2;
        }

        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return t0.e("io.elevenlabs.data.model.PodcastUserRatings.Content", values(), new String[]{"thumbs_up", "thumbs_down"}, new Annotation[][]{null, null});
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static Content valueOf(String str) {
            return (Content) Enum.valueOf(Content.class, str);
        }

        public static Content[] values() {
            return (Content[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/PodcastUserRatings$Content$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/PodcastUserRatings$Content;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) Content.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lio/elevenlabs/data/model/PodcastUserRatings$Voice;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "THUMBS_UP", "THUMBS_DOWN", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public static final class Voice extends Enum<Voice> {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ Voice[] $VALUES;
        private static final h $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;
        public static final Voice THUMBS_UP = new Voice("THUMBS_UP", 0, "thumbs_up");
        public static final Voice THUMBS_DOWN = new Voice("THUMBS_DOWN", 1, "thumbs_down");

        private static final /* synthetic */ Voice[] $values() {
            return new Voice[]{THUMBS_UP, THUMBS_DOWN};
        }

        static {
            Voice[] $values = $values();
            $VALUES = $values;
            $ENTRIES = rd.c1.q($values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = sn.a.d(i.f31597b, new io.elevenlabs.data.database.entities.reads.a(17));
        }

        private Voice(String str, int i10, String str2) {
            super(str, i10);
            this.value = str2;
        }

        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return t0.e("io.elevenlabs.data.model.PodcastUserRatings.Voice", values(), new String[]{"thumbs_up", "thumbs_down"}, new Annotation[][]{null, null});
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static Voice valueOf(String str) {
            return (Voice) Enum.valueOf(Voice.class, str);
        }

        public static Voice[] values() {
            return (Voice[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/PodcastUserRatings$Voice$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/PodcastUserRatings$Voice;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) Voice.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/PodcastUserRatings$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/PodcastUserRatings;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return PodcastUserRatings$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void getVoice$annotations() {
    }

    public PodcastUserRatings(Content content, Voice voice) {
        content.getClass();
        voice.getClass();
        this.content = content;
        this.voice = voice;
    }
}

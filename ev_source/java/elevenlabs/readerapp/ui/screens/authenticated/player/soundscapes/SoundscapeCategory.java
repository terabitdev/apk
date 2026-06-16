package io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.Soundscape;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapeCategory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import oo.f0;
import tn.o;
import tn.p;
import wq.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00182\u00020\u0001:\b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u001d\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003J\u0006\u0010\u0010\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0007\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory;", "", "serverValue", "", "labelRes", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getServerValue", "()Ljava/lang/String;", "getLabelRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "matches", "", "category", "fallbackDisplayName", "All", "Focus", "Sleep", "Story", "Nature", "Ambience", "Custom", "Companion", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory$All;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory$Ambience;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory$Custom;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory$Focus;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory$Nature;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory$Sleep;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory$Story;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class SoundscapeCategory {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<SoundscapeCategory> presets = ig.f.I(Focus.INSTANCE, Sleep.INSTANCE, Story.INSTANCE, Nature.INSTANCE, Ambience.INSTANCE);
    private final Integer labelRes;
    private final String serverValue;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory$All;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class All extends SoundscapeCategory {
        public static final int $stable = 0;
        public static final All INSTANCE = new All();

        private All() {
            super("all", Integer.valueOf(R.string.player_soundscapes_all), null);
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof All)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1929411254;
        }

        public String toString() {
            return "All";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory$Ambience;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Ambience extends SoundscapeCategory {
        public static final int $stable = 0;
        public static final Ambience INSTANCE = new Ambience();

        private Ambience() {
            super("ambience", Integer.valueOf(R.string.player_soundscapes_ambience), null);
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof Ambience)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -56966455;
        }

        public String toString() {
            return "Ambience";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory$Custom;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Custom extends SoundscapeCategory {
        public static final int $stable = 0;
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Custom(String str) {
            super(str, null, 0 == true ? 1 : 0);
            str.getClass();
            this.value = str;
        }

        public static /* synthetic */ Custom copy$default(Custom custom, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = custom.value;
            }
            return custom.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final Custom copy(String value) {
            value.getClass();
            return new Custom(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Custom) && kotlin.jvm.internal.m.c(this.value, ((Custom) other).value)) {
                return true;
            }
            return false;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return defpackage.f.C("Custom(value=", this.value, Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory$Focus;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Focus extends SoundscapeCategory {
        public static final int $stable = 0;
        public static final Focus INSTANCE = new Focus();

        private Focus() {
            super("focus", Integer.valueOf(R.string.player_soundscapes_focus), null);
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof Focus)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1256954707;
        }

        public String toString() {
            return "Focus";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory$Nature;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Nature extends SoundscapeCategory {
        public static final int $stable = 0;
        public static final Nature INSTANCE = new Nature();

        private Nature() {
            super("nature", Integer.valueOf(R.string.player_soundscapes_nature), null);
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof Nature)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -94279822;
        }

        public String toString() {
            return "Nature";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory$Sleep;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Sleep extends SoundscapeCategory {
        public static final int $stable = 0;
        public static final Sleep INSTANCE = new Sleep();

        private Sleep() {
            super("sleep", Integer.valueOf(R.string.player_soundscapes_sleep), null);
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof Sleep)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1245036884;
        }

        public String toString() {
            return "Sleep";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory$Story;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Story extends SoundscapeCategory {
        public static final int $stable = 0;
        public static final Story INSTANCE = new Story();

        private Story() {
            super("story", Integer.valueOf(R.string.player_soundscapes_story), null);
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof Story)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1244788534;
        }

        public String toString() {
            return "Story";
        }
    }

    private SoundscapeCategory(String str, Integer num) {
        this.serverValue = str;
        this.labelRes = num;
    }

    public final String fallbackDisplayName() {
        String valueOf;
        String str = this.serverValue;
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                Locale locale = Locale.getDefault();
                locale.getClass();
                valueOf = f0.y0(charAt, locale);
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb.append((Object) valueOf);
            sb.append(str.substring(1));
            return sb.toString();
        }
        return str;
    }

    public final Integer getLabelRes() {
        return this.labelRes;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    public final boolean matches(String category) {
        category.getClass();
        return u.O(this.serverValue, category, true);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory$Companion;", "", "<init>", "()V", "presets", "", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory;", "getPresets", "()Ljava/util/List;", "fromServerValue", "value", "", "buildTabs", "soundscapes", "Lio/elevenlabs/domain/model/Soundscape;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final List<SoundscapeCategory> buildTabs(List<Soundscape> soundscapes) {
            soundscapes.getClass();
            if (soundscapes.isEmpty()) {
                return o.O0(getPresets(), ig.f.H(All.INSTANCE));
            }
            ArrayList arrayList = new ArrayList(p.a0(soundscapes, 10));
            Iterator<T> it = soundscapes.iterator();
            while (it.hasNext()) {
                arrayList.add(SoundscapeCategory.INSTANCE.fromServerValue(((Soundscape) it.next()).getCategory()));
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                String serverValue = ((SoundscapeCategory) next).getServerValue();
                Locale locale = Locale.ROOT;
                locale.getClass();
                String lowerCase = serverValue.toLowerCase(locale);
                lowerCase.getClass();
                if (hashSet.add(lowerCase)) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if (next2 instanceof Custom) {
                    arrayList3.add(next2);
                }
            }
            return o.O0(o.a1(new Comparator() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapeCategory$Companion$buildTabs$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    String serverValue2 = ((SoundscapeCategory.Custom) t10).getServerValue();
                    Locale locale2 = Locale.ROOT;
                    locale2.getClass();
                    String lowerCase2 = serverValue2.toLowerCase(locale2);
                    lowerCase2.getClass();
                    String serverValue3 = ((SoundscapeCategory.Custom) t11).getServerValue();
                    locale2.getClass();
                    String lowerCase3 = serverValue3.toLowerCase(locale2);
                    lowerCase3.getClass();
                    return wn.e.g(lowerCase2, lowerCase3);
                }
            }, arrayList3), o.O0(getPresets(), ig.f.H(All.INSTANCE)));
        }

        public final SoundscapeCategory fromServerValue(String value) {
            Object obj;
            value.getClass();
            Iterator<T> it = getPresets().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((SoundscapeCategory) obj).matches(value)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            SoundscapeCategory soundscapeCategory = (SoundscapeCategory) obj;
            if (soundscapeCategory == null) {
                return new Custom(value);
            }
            return soundscapeCategory;
        }

        public final List<SoundscapeCategory> getPresets() {
            return SoundscapeCategory.presets;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SoundscapeCategory(String str, Integer num, kotlin.jvm.internal.f fVar) {
        this(str, num);
    }
}

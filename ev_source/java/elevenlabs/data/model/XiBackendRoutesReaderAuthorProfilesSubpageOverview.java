package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import j0.c;
import java.lang.annotation.Annotation;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import tr.b;
import ur.c1;
import ur.g1;
import ur.h0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0003:;9B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBY\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJN\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010\u001bR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b3\u0010.\u001a\u0004\b2\u0010\u001eR,\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00104\u0012\u0004\b6\u0010.\u001a\u0004\b5\u0010 R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010+\u0012\u0004\b8\u0010.\u001a\u0004\b7\u0010\u001b¨\u0006<"}, d2 = {"Lio/elevenlabs/data/model/XiBackendRoutesReaderAuthorProfilesSubpageOverview;", "", "", "id", "title", "Lio/elevenlabs/data/model/XiBackendRoutesReaderAuthorProfilesSubpageOverview$DefaultSort;", "defaultSort", "", "availableSorts", "itemCountLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/XiBackendRoutesReaderAuthorProfilesSubpageOverview$DefaultSort;Ljava/util/Map;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/XiBackendRoutesReaderAuthorProfilesSubpageOverview$DefaultSort;Ljava/util/Map;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/XiBackendRoutesReaderAuthorProfilesSubpageOverview;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lio/elevenlabs/data/model/XiBackendRoutesReaderAuthorProfilesSubpageOverview$DefaultSort;", "component4", "()Ljava/util/Map;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/XiBackendRoutesReaderAuthorProfilesSubpageOverview$DefaultSort;Ljava/util/Map;Ljava/lang/String;)Lio/elevenlabs/data/model/XiBackendRoutesReaderAuthorProfilesSubpageOverview;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getTitle", "getTitle$annotations", "Lio/elevenlabs/data/model/XiBackendRoutesReaderAuthorProfilesSubpageOverview$DefaultSort;", "getDefaultSort", "getDefaultSort$annotations", "Ljava/util/Map;", "getAvailableSorts", "getAvailableSorts$annotations", "getItemCountLabel", "getItemCountLabel$annotations", "Companion", "DefaultSort", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class XiBackendRoutesReaderAuthorProfilesSubpageOverview {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, String> availableSorts;
    private final DefaultSort defaultSort;
    private final String id;
    private final String itemCountLabel;
    private final String title;

    static {
        a aVar = new a(0);
        i iVar = i.f31597b;
        $childSerializers = new h[]{null, null, sn.a.d(iVar, aVar), sn.a.d(iVar, new a(1)), null};
    }

    public /* synthetic */ XiBackendRoutesReaderAuthorProfilesSubpageOverview(int i10, String str, String str2, DefaultSort defaultSort, Map map, String str3, c1 c1Var) {
        if (31 == (i10 & 31)) {
            this.id = str;
            this.title = str2;
            this.defaultSort = defaultSort;
            this.availableSorts = map;
            this.itemCountLabel = str3;
            return;
        }
        t0.j(i10, 31, XiBackendRoutesReaderAuthorProfilesSubpageOverview$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return DefaultSort.INSTANCE.serializer();
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        g1 g1Var = g1.f34588a;
        return new h0(g1Var, g1Var);
    }

    public static /* synthetic */ XiBackendRoutesReaderAuthorProfilesSubpageOverview copy$default(XiBackendRoutesReaderAuthorProfilesSubpageOverview xiBackendRoutesReaderAuthorProfilesSubpageOverview, String str, String str2, DefaultSort defaultSort, Map map, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = xiBackendRoutesReaderAuthorProfilesSubpageOverview.id;
        }
        if ((i10 & 2) != 0) {
            str2 = xiBackendRoutesReaderAuthorProfilesSubpageOverview.title;
        }
        if ((i10 & 4) != 0) {
            defaultSort = xiBackendRoutesReaderAuthorProfilesSubpageOverview.defaultSort;
        }
        if ((i10 & 8) != 0) {
            map = xiBackendRoutesReaderAuthorProfilesSubpageOverview.availableSorts;
        }
        if ((i10 & 16) != 0) {
            str3 = xiBackendRoutesReaderAuthorProfilesSubpageOverview.itemCountLabel;
        }
        String str4 = str3;
        DefaultSort defaultSort2 = defaultSort;
        return xiBackendRoutesReaderAuthorProfilesSubpageOverview.copy(str, str2, defaultSort2, map, str4);
    }

    public static final /* synthetic */ void write$Self$data_release(XiBackendRoutesReaderAuthorProfilesSubpageOverview self, b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.V(serialDesc, 0, self.id);
        output.V(serialDesc, 1, self.title);
        output.g(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.defaultSort);
        output.g(serialDesc, 3, (KSerializer) hVarArr[3].getValue(), self.availableSorts);
        output.V(serialDesc, 4, self.itemCountLabel);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final DefaultSort getDefaultSort() {
        return this.defaultSort;
    }

    public final Map<String, String> component4() {
        return this.availableSorts;
    }

    /* renamed from: component5, reason: from getter */
    public final String getItemCountLabel() {
        return this.itemCountLabel;
    }

    public final XiBackendRoutesReaderAuthorProfilesSubpageOverview copy(String id2, String title, DefaultSort defaultSort, Map<String, String> availableSorts, String itemCountLabel) {
        id2.getClass();
        title.getClass();
        defaultSort.getClass();
        availableSorts.getClass();
        itemCountLabel.getClass();
        return new XiBackendRoutesReaderAuthorProfilesSubpageOverview(id2, title, defaultSort, availableSorts, itemCountLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XiBackendRoutesReaderAuthorProfilesSubpageOverview)) {
            return false;
        }
        XiBackendRoutesReaderAuthorProfilesSubpageOverview xiBackendRoutesReaderAuthorProfilesSubpageOverview = (XiBackendRoutesReaderAuthorProfilesSubpageOverview) other;
        if (m.c(this.id, xiBackendRoutesReaderAuthorProfilesSubpageOverview.id) && m.c(this.title, xiBackendRoutesReaderAuthorProfilesSubpageOverview.title) && this.defaultSort == xiBackendRoutesReaderAuthorProfilesSubpageOverview.defaultSort && m.c(this.availableSorts, xiBackendRoutesReaderAuthorProfilesSubpageOverview.availableSorts) && m.c(this.itemCountLabel, xiBackendRoutesReaderAuthorProfilesSubpageOverview.itemCountLabel)) {
            return true;
        }
        return false;
    }

    public final Map<String, String> getAvailableSorts() {
        return this.availableSorts;
    }

    public final DefaultSort getDefaultSort() {
        return this.defaultSort;
    }

    public final String getId() {
        return this.id;
    }

    public final String getItemCountLabel() {
        return this.itemCountLabel;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.itemCountLabel.hashCode() + f.a(this.availableSorts, (this.defaultSort.hashCode() + c.c(this.id.hashCode() * 31, 31, this.title)) * 31, 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        DefaultSort defaultSort = this.defaultSort;
        Map<String, String> map = this.availableSorts;
        String str3 = this.itemCountLabel;
        StringBuilder s10 = f.s("XiBackendRoutesReaderAuthorProfilesSubpageOverview(id=", str, ", title=", str2, ", defaultSort=");
        s10.append(defaultSort);
        s10.append(", availableSorts=");
        s10.append(map);
        s10.append(", itemCountLabel=");
        return f.l(str3, Separators.RPAREN, s10);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lio/elevenlabs/data/model/XiBackendRoutesReaderAuthorProfilesSubpageOverview$DefaultSort;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ALPHABETICAL", "CREATED_AT_UNIX_DESC", "CREATED_AT_UNIX_ASC", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public static final class DefaultSort extends Enum<DefaultSort> {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ DefaultSort[] $VALUES;
        private static final h $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;
        public static final DefaultSort ALPHABETICAL = new DefaultSort("ALPHABETICAL", 0, "alphabetical");
        public static final DefaultSort CREATED_AT_UNIX_DESC = new DefaultSort("CREATED_AT_UNIX_DESC", 1, "created_at_unix_desc");
        public static final DefaultSort CREATED_AT_UNIX_ASC = new DefaultSort("CREATED_AT_UNIX_ASC", 2, "created_at_unix_asc");

        private static final /* synthetic */ DefaultSort[] $values() {
            return new DefaultSort[]{ALPHABETICAL, CREATED_AT_UNIX_DESC, CREATED_AT_UNIX_ASC};
        }

        static {
            DefaultSort[] $values = $values();
            $VALUES = $values;
            $ENTRIES = rd.c1.q($values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = sn.a.d(i.f31597b, new a(2));
        }

        private DefaultSort(String str, int i10, String str2) {
            super(str, i10);
            this.value = str2;
        }

        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return t0.e("io.elevenlabs.data.model.XiBackendRoutesReaderAuthorProfilesSubpageOverview.DefaultSort", values(), new String[]{"alphabetical", "created_at_unix_desc", "created_at_unix_asc"}, new Annotation[][]{null, null, null});
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static DefaultSort valueOf(String str) {
            return (DefaultSort) Enum.valueOf(DefaultSort.class, str);
        }

        public static DefaultSort[] values() {
            return (DefaultSort[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/XiBackendRoutesReaderAuthorProfilesSubpageOverview$DefaultSort$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/XiBackendRoutesReaderAuthorProfilesSubpageOverview$DefaultSort;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) DefaultSort.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/XiBackendRoutesReaderAuthorProfilesSubpageOverview$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/XiBackendRoutesReaderAuthorProfilesSubpageOverview;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return XiBackendRoutesReaderAuthorProfilesSubpageOverview$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAvailableSorts$annotations() {
    }

    public static /* synthetic */ void getDefaultSort$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getItemCountLabel$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public XiBackendRoutesReaderAuthorProfilesSubpageOverview(String str, String str2, DefaultSort defaultSort, Map<String, String> map, String str3) {
        str.getClass();
        str2.getClass();
        defaultSort.getClass();
        map.getClass();
        str3.getClass();
        this.id = str;
        this.title = str2;
        this.defaultSort = defaultSort;
        this.availableSorts = map;
        this.itemCountLabel = str3;
    }
}

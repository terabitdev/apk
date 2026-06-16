package io.elevenlabs.highlighter;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b \u0010\u000e¨\u0006!"}, d2 = {"Lio/elevenlabs/highlighter/AnnotationData;", "", "Ls4/h;", ParameterNames.TEXT, "", "Lio/elevenlabs/highlighter/WordAnnotation;", "annotations", "Lio/elevenlabs/highlighter/BookmarkAnnotation;", "bookmarks", "<init>", "(Ls4/h;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ls4/h;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ls4/h;Ljava/util/List;Ljava/util/List;)Lio/elevenlabs/highlighter/AnnotationData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ls4/h;", "getText", "Ljava/util/List;", "getAnnotations", "getBookmarks", "highlighter_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class AnnotationData {
    private final List<WordAnnotation> annotations;
    private final List<BookmarkAnnotation> bookmarks;
    private final s4.h text;

    public AnnotationData(s4.h hVar, List<WordAnnotation> list, List<BookmarkAnnotation> list2) {
        hVar.getClass();
        list.getClass();
        list2.getClass();
        this.text = hVar;
        this.annotations = list;
        this.bookmarks = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnnotationData copy$default(AnnotationData annotationData, s4.h hVar, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = annotationData.text;
        }
        if ((i10 & 2) != 0) {
            list = annotationData.annotations;
        }
        if ((i10 & 4) != 0) {
            list2 = annotationData.bookmarks;
        }
        return annotationData.copy(hVar, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final s4.h getText() {
        return this.text;
    }

    public final List<WordAnnotation> component2() {
        return this.annotations;
    }

    public final List<BookmarkAnnotation> component3() {
        return this.bookmarks;
    }

    public final AnnotationData copy(s4.h text, List<WordAnnotation> annotations, List<BookmarkAnnotation> bookmarks) {
        text.getClass();
        annotations.getClass();
        bookmarks.getClass();
        return new AnnotationData(text, annotations, bookmarks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnotationData)) {
            return false;
        }
        AnnotationData annotationData = (AnnotationData) other;
        if (kotlin.jvm.internal.m.c(this.text, annotationData.text) && kotlin.jvm.internal.m.c(this.annotations, annotationData.annotations) && kotlin.jvm.internal.m.c(this.bookmarks, annotationData.bookmarks)) {
            return true;
        }
        return false;
    }

    public final List<WordAnnotation> getAnnotations() {
        return this.annotations;
    }

    public final List<BookmarkAnnotation> getBookmarks() {
        return this.bookmarks;
    }

    public final s4.h getText() {
        return this.text;
    }

    public int hashCode() {
        return this.bookmarks.hashCode() + p.n.d(this.text.hashCode() * 31, 31, this.annotations);
    }

    public String toString() {
        s4.h hVar = this.text;
        List<WordAnnotation> list = this.annotations;
        List<BookmarkAnnotation> list2 = this.bookmarks;
        StringBuilder sb = new StringBuilder("AnnotationData(text=");
        sb.append((Object) hVar);
        sb.append(", annotations=");
        sb.append(list);
        sb.append(", bookmarks=");
        return z.h.e(sb, list2, Separators.RPAREN);
    }
}

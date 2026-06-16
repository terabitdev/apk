package io.elevenlabs.player;

import ae.l;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import org.jsoup.nodes.g;
import rd.s0;
import sn.k;
import tn.n;
import tn.o;
import wq.u;
import xs.v;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\f\u001a-\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001aI\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aA\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001d\u0010\u001b\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0019\u0010\u001d\u001a\u00020\u0000*\b\u0012\u0004\u0012\u00020\r0\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a%\u0010 \u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!\u001a%\u0010#\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$\u001a%\u0010%\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010$\u001a'\u0010'\u001a\u0004\u0018\u00010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(\u001a'\u0010*\u001a\u0004\u0018\u00010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b*\u0010(\u001a\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020\rH\u0002¢\u0006\u0004\b-\u0010.\"\u0014\u0010/\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u00100\"\u0014\u00101\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u00100\"\u001a\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105\"\u001a\u00106\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105¨\u00067"}, d2 = {"", "html", "", "focusOffset", "", "maxLen", "Lio/elevenlabs/player/BookmarkWindow;", "bookmarkWindow", "(Ljava/lang/String;JI)Lio/elevenlabs/player/BookmarkWindow;", "", "elements", "focusElementIndex", "(Ljava/util/List;IJI)Lio/elevenlabs/player/BookmarkWindow;", "Lio/elevenlabs/player/SpanInfo;", "spans", "windowOver", "(Ljava/util/List;JI)Lio/elevenlabs/player/BookmarkWindow;", "startIdx", "endIdx", "focusIdx", "Lsn/k;", "trimAroundFocus", "(Ljava/util/List;IIII)Lsn/k;", "expandToAdjacentSentences", "(Ljava/util/List;III)Lsn/k;", "parseSpans", "(Ljava/lang/String;)Ljava/util/List;", "charSpan", "(Ljava/util/List;)J", "joinText", "(Ljava/util/List;)Ljava/lang/String;", "offset", "focusSpanIndex", "(Ljava/util/List;J)I", "fromIdx", "sentenceStartIndex", "(Ljava/util/List;I)I", "sentenceEndIndex", "afterIdx", "nextSentenceEnd", "(Ljava/util/List;I)Ljava/lang/Integer;", "beforeIdx", "previousSentenceStart", "span", "", "endsSentence", "(Lio/elevenlabs/player/SpanInfo;)Z", "MAX_BOOKMARK_CHARS", TokenNames.I, "EXPAND_BUDGET_MULTIPLIER", "", "", "SENTENCE_END_PUNCTUATION", "Ljava/util/Set;", "TRAILING_CLOSERS", "player_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BookmarkWindowingKt {
    private static final int EXPAND_BUDGET_MULTIPLIER = 3;
    public static final int MAX_BOOKMARK_CHARS = 400;
    private static final Set<Character> SENTENCE_END_PUNCTUATION = n.f1(new Character[]{'.', '!', '?', 8230});
    private static final Set<Character> TRAILING_CLOSERS = n.f1(new Character[]{'\"', '\'', 8221, 8217, ')', ']', '}'});

    public static final BookmarkWindow bookmarkWindow(List<String> list, int i10, long j4, int i11) {
        boolean z6;
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        int m10 = l.m(i10, 0, list.size() - 1);
        int i12 = i11 * 3;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(bookmarkWindow$spansOf(hashMap, list, m10));
        int i13 = m10;
        do {
            long j10 = i12;
            if (charSpan(arrayList) >= j10) {
                break;
            }
            if (m10 > 0) {
                m10--;
                arrayList.addAll(0, bookmarkWindow$spansOf(hashMap, list, m10));
                z6 = true;
            } else {
                z6 = false;
            }
            if (i13 < list.size() - 1 && charSpan(arrayList) < j10) {
                i13++;
                arrayList.addAll(bookmarkWindow$spansOf(hashMap, list, i13));
                z6 = true;
            }
        } while (z6);
        if (arrayList.isEmpty()) {
            return null;
        }
        return windowOver(arrayList, j4, i11);
    }

    public static /* synthetic */ BookmarkWindow bookmarkWindow$default(String str, long j4, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 400;
        }
        return bookmarkWindow(str, j4, i10);
    }

    private static final List<SpanInfo> bookmarkWindow$spansOf(HashMap<Integer, List<SpanInfo>> hashMap, List<String> list, int i10) {
        Integer valueOf = Integer.valueOf(i10);
        List<SpanInfo> list2 = hashMap.get(valueOf);
        if (list2 == null) {
            list2 = parseSpans(list.get(i10));
            hashMap.put(valueOf, list2);
        }
        return list2;
    }

    private static final long charSpan(List<SpanInfo> list) {
        if (list.isEmpty()) {
            return 0L;
        }
        return ((SpanInfo) o.G0(list)).getEndExclusive() - ((SpanInfo) o.w0(list)).getStart();
    }

    private static final boolean endsSentence(SpanInfo spanInfo) {
        String obj = wq.n.L0(spanInfo.getText()).toString();
        while (obj.length() > 0 && TRAILING_CLOSERS.contains(Character.valueOf(wq.n.n0(obj)))) {
            obj = wq.n.c0(obj);
        }
        if (obj.length() == 0) {
            return false;
        }
        return SENTENCE_END_PUNCTUATION.contains(Character.valueOf(wq.n.n0(obj)));
    }

    private static final k expandToAdjacentSentences(List<SpanInfo> list, int i10, int i11, int i12) {
        boolean z6 = true;
        boolean z10 = true;
        boolean z11 = true;
        while (true) {
            if (!z6 && !z10) {
                return new k(Integer.valueOf(i10), Integer.valueOf(i11));
            }
            if ((z11 && z6) || !z10) {
                Integer nextSentenceEnd = nextSentenceEnd(list, i11);
                if (nextSentenceEnd != null && list.get(nextSentenceEnd.intValue()).getEndExclusive() - list.get(i10).getStart() <= i12) {
                    i11 = nextSentenceEnd.intValue();
                    z11 = !z11;
                } else {
                    z6 = false;
                }
            } else {
                Integer previousSentenceStart = previousSentenceStart(list, i10);
                if (previousSentenceStart != null && list.get(i11).getEndExclusive() - list.get(previousSentenceStart.intValue()).getStart() <= i12) {
                    i10 = previousSentenceStart.intValue();
                    z11 = !z11;
                } else {
                    z10 = false;
                }
            }
        }
    }

    private static final int focusSpanIndex(List<SpanInfo> list, long j4) {
        Iterator<SpanInfo> it = list.iterator();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (it.hasNext()) {
                if (it.next().getStart() == j4) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        Iterator<T> it2 = list.iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            int i13 = i10 + 1;
            if (((SpanInfo) it2.next()).getStart() > j4) {
                break;
            }
            i12 = i10;
            i10 = i13;
        }
        return i12;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [ho.l, java.lang.Object] */
    private static final String joinText(List<SpanInfo> list) {
        return wq.n.L0(o.E0(list, Separators.SP, null, null, new Object(), 30)).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence joinText$lambda$0(SpanInfo spanInfo) {
        spanInfo.getClass();
        return spanInfo.getText();
    }

    private static final Integer nextSentenceEnd(List<SpanInfo> list, int i10) {
        do {
            i10++;
            if (i10 >= list.size()) {
                return null;
            }
        } while (!endsSentence(list.get(i10)));
        return Integer.valueOf(i10);
    }

    private static final List<SpanInfo> parseSpans(String str) {
        SpanInfo spanInfo;
        g B = s0.B(str);
        us.g.z("span[c]");
        xs.e e10 = jo.a.e(v.g0("span[c]"), B);
        e10.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = e10.iterator();
        while (it.hasNext()) {
            org.jsoup.nodes.k kVar = (org.jsoup.nodes.k) it.next();
            String d10 = kVar.d("c");
            d10.getClass();
            Long Z = u.Z(d10);
            if (Z != null) {
                long longValue = Z.longValue();
                String a02 = kVar.a0();
                a02.getClass();
                spanInfo = new SpanInfo(longValue, longValue + a02.length(), a02);
            } else {
                spanInfo = null;
            }
            if (spanInfo != null) {
                arrayList.add(spanInfo);
            }
        }
        return arrayList;
    }

    private static final Integer previousSentenceStart(List<SpanInfo> list, int i10) {
        if (i10 == 0) {
            return null;
        }
        for (int i11 = i10 - 1; i11 > 0; i11--) {
            if (endsSentence(list.get(i11 - 1))) {
                return Integer.valueOf(i11);
            }
        }
        return 0;
    }

    private static final int sentenceEndIndex(List<SpanInfo> list, int i10) {
        while (i10 < list.size() - 1) {
            if (endsSentence(list.get(i10))) {
                return i10;
            }
            i10++;
        }
        return list.size() - 1;
    }

    private static final int sentenceStartIndex(List<SpanInfo> list, int i10) {
        while (i10 > 0) {
            if (endsSentence(list.get(i10 - 1))) {
                return i10;
            }
            i10--;
        }
        return 0;
    }

    private static final k trimAroundFocus(List<SpanInfo> list, int i10, int i11, int i12, int i13) {
        long j4;
        while (true) {
            j4 = i13;
            if (list.get(i11).getEndExclusive() - list.get(i10).getStart() <= j4 || i11 <= i12) {
                break;
            }
            i11--;
        }
        while (list.get(i11).getEndExclusive() - list.get(i10).getStart() > j4 && i10 < i12) {
            i10++;
        }
        return new k(Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private static final BookmarkWindow windowOver(List<SpanInfo> list, long j4, int i10) {
        int intValue;
        int intValue2;
        int focusSpanIndex = focusSpanIndex(list, j4);
        int sentenceStartIndex = sentenceStartIndex(list, focusSpanIndex);
        int sentenceEndIndex = sentenceEndIndex(list, focusSpanIndex);
        if (list.get(sentenceEndIndex).getEndExclusive() - list.get(sentenceStartIndex).getStart() > i10) {
            k trimAroundFocus = trimAroundFocus(list, sentenceStartIndex, sentenceEndIndex, focusSpanIndex, i10);
            intValue = ((Number) trimAroundFocus.f31600a).intValue();
            intValue2 = ((Number) trimAroundFocus.f31601b).intValue();
        } else {
            k expandToAdjacentSentences = expandToAdjacentSentences(list, sentenceStartIndex, sentenceEndIndex, i10);
            intValue = ((Number) expandToAdjacentSentences.f31600a).intValue();
            intValue2 = ((Number) expandToAdjacentSentences.f31601b).intValue();
        }
        return new BookmarkWindow(list.get(intValue).getStart(), list.get(intValue2).getEndExclusive(), joinText(list.subList(intValue, intValue2 + 1)));
    }

    public static /* synthetic */ BookmarkWindow bookmarkWindow$default(List list, int i10, long j4, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = 400;
        }
        return bookmarkWindow(list, i10, j4, i11);
    }

    public static final BookmarkWindow bookmarkWindow(String str, long j4, int i10) {
        str.getClass();
        return bookmarkWindow(ig.f.H(str), 0, j4, i10);
    }
}

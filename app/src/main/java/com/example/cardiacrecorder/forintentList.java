package com.example.cardiacrecorder;
import android.icu.util.Measure;

import java.util.ArrayList;
import java.util.List;
public class forintentList {
    List<forintent>mList=new ArrayList<>();

    /**
     * This adds measure to the arrayList
     * @param measure
     *      This is the measure to add
     */

    public void add(forintent measure)
    {
        if(mList.contains(measure))
        {
            throw new IllegalArgumentException();
        }
        mList.add(measure);
    }

    /**
     * This removes a measure from the list
     * @param forintent
     *      This is the measure to delete
     */

    public void remove(forintent forintent)
    {
        if(mList.contains(forintent))
        {
            mList.remove(forintent);
        }
        else
        {
            throw new IllegalArgumentException();
        }
    }

    /**
     * This is edits a measure in given position
     * @param pos
     *      the position where we will edit
     * @param forintent
     *      the measure which will update the values
     */

    public void edit(int pos, forintent forintent)
    {
        mList.set(pos,forintent);
    }

    /**
     * This returns the list
     * @return
     *      return the list
     */

    public List<forintent>getMeasure()
    {
        return mList;
    }
}
